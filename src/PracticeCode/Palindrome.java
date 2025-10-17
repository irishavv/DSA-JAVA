package PracticeCode;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int num = number;
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num/10;
        }
        System.out.println("Reverse number of "+ number + " is " + reverse);

        if(number == reverse){
            System.out.print("It is a Palindrome");
        }else{
            System.out.print("It is not a Palindrome");
        }
    }
}
