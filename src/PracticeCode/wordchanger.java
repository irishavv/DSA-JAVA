package PracticeCode;


//need to understand this code i can't able to complete


public class wordchanger {
    public static void main(String[] args) {
        String sentence = "*ram **is a ##good #boy";
        System.out.println(change(sentence));
    }

    static String change(String sentence) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        boolean capitalizeNextChar = false;
        boolean capitalizeNextWord = false;
        int hashCount = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.startsWith("**")) {
                capitalizeNextWord = true;
                word = word.substring(2); // remove **
            } else if (word.startsWith("*")) {
                capitalizeNextChar = true;
                word = word.substring(1); // remove *
            } else if (word.startsWith("##")) {
                hashCount = 2;
                word = word.substring(2); // remove ##
            } else if (word.startsWith("#")) {
                hashCount = 1;
                word = word.substring(1); // remove #
            }

            if (capitalizeNextChar && word.length() > 0) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                capitalizeNextChar = false;
            } else if (capitalizeNextWord) {
                word = word.toUpperCase();
                capitalizeNextWord = false;
            } else if (hashCount == 1) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < word.length(); j++) {
                    if (j % 2 == 0) {
                        sb.append(Character.toUpperCase(word.charAt(j)));
                    } else {
                        sb.append(Character.toLowerCase(word.charAt(j)));
                    }
                }
                word = sb.toString();
                hashCount = 0;
            } else if (hashCount == 2) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < word.length(); j++) {
                    if (j % 2 != 0) {
                        sb.append(Character.toUpperCase(word.charAt(j)));
                    } else {
                        sb.append(Character.toLowerCase(word.charAt(j)));
                    }
                }
                word = sb.toString();
                hashCount = 0;
            }

            result.append(word);
            if (i != words.length - 1) result.append(" ");
        }

        return result.toString();
    }
}
