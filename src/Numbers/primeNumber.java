package Numbers;

public class primeNumber {
    public static void main(String[] args) {

        primeNumber1(4);
    }

    public static void primeNumber1(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a Prime Number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }
}
