package PracticeCode;
import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        Sumproduct(num1,num2);

    }
    public static void Sumproduct(int num1 , int num2){
        int product;
        int sum;
        product = num1 * num2;
        sum = num1 + num2;
        System.out.print("The difference: " + (product - sum));
    }
}
