package PracticeCode;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayEvenOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n;i++){
            arr[i] = scan.nextInt();
        }

        Checkevenodd(arr);
        System.out.println("Shorted Even Odd:  " + Arrays.toString(arr));


    }
    public static void Checkevenodd(int[] arr){
        Arrays.sort(arr);

        int[] temp = new int[arr.length];
        int index = 0;


        for(int num : arr){
            if(num%2 == 0){
                temp[index++] = num;
            }
        }

/*
        for(int i = 0; i< arr.length;i++){
            int num = arr[i];
            if(num%2 == 0){
                temp[index++] = num;
            }
        }
*/

        for(int num : arr){
            if(num%2 !=0){
                temp[index++] = num;
            }
        }

/*
        for(int i =0;i<arr.length; i++){
            int num = arr[i];
            if(num%2 != 0){
                temp[index++] = num;
            }
        }
*/

        for(int i = 0; i<arr.length;i++){
            arr[i] = temp[i];
        }

    }
}
