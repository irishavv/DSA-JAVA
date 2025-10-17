package Numbers;

public class reverse {
    public static void main(String[] args){
        int num = 432;
        int result = reverse1(num);
        System.out.println(result); // Output: 234
    }

    static int reverse1(int num){
        int rev = 0;
        while(num > 0){
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        return rev;
    }
}
