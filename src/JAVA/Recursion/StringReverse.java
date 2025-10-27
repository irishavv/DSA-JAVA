package src.JAVA.Recursion;

public class StringReverse {
    public static void main(String[] args) {
        String str = "abcdefg";
        int n = str.length()-1;
        reverse(str,n);
    }

    public static void reverse(String str, int idx) {

        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        reverse(str, idx-1);



    }
}
