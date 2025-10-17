package PracticeCode;
import java.util.Scanner;
//Input currency in rupees and output in USD.

public class RupeeToUSD {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Indian Rupee for converting USD: ");
        float Currency = scan.nextFloat();

        float USD = 86.58f;

        System.out.print(Currency + " Rupee in USD " + Currency*USD);

    }
}
