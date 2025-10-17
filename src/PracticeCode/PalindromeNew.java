package PracticeCode;

import java. util.Scanner;

public class PalindromeNew {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        pnumber(num);
    }
    public static void pnumber(int num){
        int number = num;
        int reversed=0;
        while(num!=0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num=num/10;
        }
        System.out.println("Reversed number:"+ reversed);
        if(reversed == number){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not Palindrome");
        }
    }



}
