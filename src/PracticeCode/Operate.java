package PracticeCode;
import java.util.Scanner;
public class Operate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1<num2){
            int Sum = num1 + num2;
            System.out.print(Sum);
        }
        else if(num1==num2){
            int Multi = num1*num2;
            System.out.print(Multi);
        }
        else if(num1>num2){
            int Div = num1/num2;
            System.out.print(Div);
        }
    }
}
