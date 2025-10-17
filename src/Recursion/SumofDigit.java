package Recursion;

public class SumofDigit {
    public static void main(String[] args){
        int result = digit(1342);
        System.out.println(result);
    }
    static int digit(int num){
        if(num == 0){
            return 0;
        }

        return (num %10) + digit(num/10);

    }
}
