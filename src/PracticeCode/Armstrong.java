package PracticeCode;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int number = num;
        int sum = 0;

        int digits = 0;
        int temp = num;
        while (temp > 0) {
            temp = temp/ 10;
            digits++;
        }

        while (num > 0) {
            int digit = num % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power = power * digit;
            }
            sum = sum + power;
            num = num/ 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
