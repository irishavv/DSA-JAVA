package Recursion;

public class ReverseNumber {
    public static void main(String[] args){
        int num = 432;
        int result = reverse(num, 0);
        System.out.println(result); // Output: 234
    }

    static int reverse(int num, int rev){
        if (num == 0) {
            return rev;
        }

        int lastDigit = num % 10;
        rev = rev * 10 + lastDigit;
        return reverse(num / 10, rev);
    }
}