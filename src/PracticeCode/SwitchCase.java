package PracticeCode;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String Animal = scan.next();

        switch (Animal){
            case "Lion" :
                System.out.println("King of Animals");
                break;
            case "Monkey" :
                System.out.println("Jump one tree to another");
                break;
            case "Dog":
                System.out.println("Homely Animal");
                break;
            default:
                System.out.println("Please enter valid name of Animal");

        }
    }
}
