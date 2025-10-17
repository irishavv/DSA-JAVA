package PracticeCode;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a second Number: ");
        int num2 = scan.nextInt();

        if(num1>num2){
            System.out.print("Largest number is "+ num1);
        }
        else{
            System.out.print("Largest number is "+ num2);
        }
    }
}
