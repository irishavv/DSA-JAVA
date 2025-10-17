package PracticeCode;
import java.util.Scanner;
public class FabicoNum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int firstnum = 0;
        int secondnum = 1;
        int nextnum;

        for(int i=0;i<n;i++){
            System.out.print(firstnum + " ");
            nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }

    }
}
