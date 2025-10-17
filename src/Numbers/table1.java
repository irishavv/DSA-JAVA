package Numbers;

import java.util.Scanner;

public class table1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Total number: ");
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            int n = scan.nextInt();
            for (int j = 1; j <= 10; j++) {
                System.out.print((" "+ j * n));
            }
            System.out.println();
        }

        scan.close();
    }
}
