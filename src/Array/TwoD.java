package Array;
import java.util.Arrays;

public class TwoD {
    public static void main(String[] args){
//        int[][] arr = new int[3][];

        int[][] arr1 = {
                {1,2},
                {3,4,5},
                {6,7,8,9}
        };
        for(int row = 0; row < arr1.length;row++){
            for(int col = 0; col<arr1[row].length;col++){
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }
    }
}
