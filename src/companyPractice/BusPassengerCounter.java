package companyPractice;

import java.util.Scanner;

public class BusPassengerCounter {
    static final int MAX_STOPS = 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Chadhna = new int[MAX_STOPS];
        int[] utarna = new int[MAX_STOPS];
        int[] TotalPerson = new int[MAX_STOPS];

        System.out.println("No of people take bus: ");
        for (int i = 0; i < MAX_STOPS; i++) {
            Chadhna[i] = sc.nextInt();
        }

        System.out.println("No. of people leave : ");
        for (int i = 0; i < MAX_STOPS; i++) {
            utarna[i] = sc.nextInt();
        }

        TotalPerson[0] = Chadhna[0] - utarna[0];
        for (int i = 1; i < MAX_STOPS; i++) {
            TotalPerson[i] = TotalPerson[i - 1] + Chadhna[i] - utarna[i];
        }

        while (true) {
            System.out.print("Enter stop number to check 0 to " + MAX_STOPS +" or -1 to exit: ");
            int stop = sc.nextInt();
            if (stop == -1) break;

            if (stop < 0 || stop >= MAX_STOPS) {
                System.out.println("Invalid stop number. Try again.");
                continue;
            }

            System.out.println("Passengers on the bus after stop " + stop + ": " + TotalPerson[stop]);
        }
    }
}
