package PracticeCode;
import java.util.Arrays;
import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total num to store: ");
        int n = scan.nextInt();
        int count = 0;
        int[] arr= new int[n];
        for(int i =0; i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i = 0;i<n; i++){
            System.out.println(arr[i]+" ");
        }

        System.out.print("Enter the number you want to count: ");
        int num = scan.nextInt();
//        System.out.println(Arrays.toString(arr));
        for(int i = 0; i <n ; i++){
            if(num == arr[i]){
                count++;
            }

        }
        System.out.println("Freq of "+num + " is " +count);

    }
}
