package Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        List<Integer> duplicate = new ArrayList<>();
        for(int i = 0; i< arr.length;i++){
            for(int j = i+1; j< arr.length;j++){
                if(arr[i] == arr[j]){
                    duplicate.add(arr[i]);
                }
            }
        }
        System.out.println(duplicate);
    }
}
