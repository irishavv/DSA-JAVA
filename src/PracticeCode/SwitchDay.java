package PracticeCode;
import java.sql.SQLOutput;
import java.util.Scanner;
public class SwitchDay {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a day number: ");
        int Day = scan.nextInt();

        switch(Day){
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Please Enter a valid number");
        }
    }
}
