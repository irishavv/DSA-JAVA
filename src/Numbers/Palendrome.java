package Numbers;

public class Palendrome {
    public static void main(String[] args){

        int number = 1234321;
        System.out.println(isPalendrome(number));

    }
    static boolean isPalendrome(int number){
        int reverse = 0;
        int num = number;

        while(num != 0 ){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }

        if(reverse == number){
            return true;
        }
        return false;

    }
}
