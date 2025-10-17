package companyPractice;

import java.util.Scanner;

public class BusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Chadhna = {2, 4, 7, 8, 9, 6, 7};
        int[] utarna  = {0, 2, 5, 3, 2, 1, 2};
        int[] TotalPerson = new int[Chadhna.length];

        TotalPerson[0] = Chadhna[0] - utarna[0];
        for (int i = 1; i < Chadhna.length; i++) {
            TotalPerson[i] = TotalPerson[i - 1] + Chadhna[i] - utarna[i];
        }


        while (true) {
            System.out.print("Enter stop number to check (1 to " + Chadhna.length + "), or -1 to exit: ");
            int stop = sc.nextInt();

            if (stop == -1) break;
            if (stop < 1 || stop > Chadhna.length) {
                System.out.println("Invalid stop number. Try again.");
                continue;
            }

            int index = stop - 1;
            System.out.println("Passengers on the bus after stop " + stop + ": " + TotalPerson[index]);
        }
    }
}