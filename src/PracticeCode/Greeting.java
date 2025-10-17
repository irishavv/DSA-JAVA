package PracticeCode;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Hey "+name+"!"+ " " + "Good Morning");
    }
}
