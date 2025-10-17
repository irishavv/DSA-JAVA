package PracticeCode;
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principle value: ");
        float P = scan.nextFloat();
        System.out.print("Enter the Time: ");
        float T = scan.nextFloat();
        System.out.print("Enter the Rate: ");
        float R = scan.nextFloat();

        float SI = (P*R*T)/100.0f;
        System.out.println("SI is "+SI);
    }
}
