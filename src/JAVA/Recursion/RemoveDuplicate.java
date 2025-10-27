package src.JAVA.Recursion;

public class RemoveDuplicate {

    public static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        String str = "abaacde";
        RemoveDuplicate(str, 0, "");
    }

    public static void RemoveDuplicate(String str, int idx, String newString) {

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }


        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            RemoveDuplicate(str, idx+1, newString);
        }else {
            newString = newString + currChar;
            map[currChar - 'a'] = true;
            RemoveDuplicate(str, idx+1, newString);
        }
    }
}
