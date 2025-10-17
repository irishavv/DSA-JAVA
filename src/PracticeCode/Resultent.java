package PracticeCode;
import java.util.Scanner;
public class Resultent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter aNum: ");
        String aNum = scanner.next();
        System.out.print("Enter bNum: ");
        String bNum = scanner.next();

        String result = "";
        for (int i = 0; i < aNum.length(); i++) {
            if (bNum.charAt(i) == '1') {
                result = result + aNum.charAt(i);
            }
        }
        System.out.println("Output: " + result);
    }
}
