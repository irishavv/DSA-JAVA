package src.JAVA.Recursion;

public class SubsequenceString {
    public static void main(String[] args) {
        String str = "abc";
        subsequenceString(str,0,"");
    }

    public static void subsequenceString(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        subsequenceString(str, idx+1, newString+currchar);

        subsequenceString(str, idx+1, newString);
    }
}
