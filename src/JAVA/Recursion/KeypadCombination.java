package src.JAVA.Recursion;

public class KeypadCombination {

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String str = "23";
        printcombination(str, 0,"");
    }

    public static void printcombination(String str, int idx, String combination) {

        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printcombination(str, idx+1, combination + mapping.charAt(i));
        }

    }
}
