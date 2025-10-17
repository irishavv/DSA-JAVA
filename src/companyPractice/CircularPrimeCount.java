package companyPractice;
import java.util.*;

public class CircularPrimeCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        scan.close();
        int count = 0;
        int number = 2;

        System.out.println("First " + n + " Circular Prime numbers:");
        while (count < n) {
            if (isCircularPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCircularPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }

        int temp = n;
        int digit = 0;

        while (temp > 0) {
            if (temp % 2 == 0) {
                return false;
            }
            temp /= 10;
            digit++;
        }

        int digitShift = (int) Math.pow(10, digit - 1);

        for (int i = 0; i < digit; i++) {
            if (!checkPrime(n)) return false;
            int lastDigit = n % 10;
            n /= 10;
            n = (digitShift * lastDigit) + n;
        }

        return true;
    }
}
