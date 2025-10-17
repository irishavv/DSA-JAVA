package PracticeCode;

public class primeNumber {
    public static void main(String[] args) {

        prime(9);
    }

    public static void prime(int num) {
        if (num < 2) {
            System.out.println("Not a Prime Number");
            return;
        }

        int c = 2;
        while (c < num) {
            if (num % c == 0) {
                System.out.println("Not a Prime Number");
                return;
            }
            c= c+1;
        }

        System.out.println("Prime Number");
    }
}
