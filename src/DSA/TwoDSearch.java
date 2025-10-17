package Array;
import java.util.Arrays;

public class TwoDSearch {
    public static void main(String[] args){
        int[][] arr = {
                {23,74,27,28},
                {74,27,83},
                {84,47}
        };
        int target = 27;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr, int target){
//        int[] error = {-202};
        if(arr.length == 0){
            return new int[] {-404};
        }
        for(int row = 0;row<arr.length;row++){
            for(int col = 0; col<arr.length;col++){
                int num = arr[row][col];
                if(num == target){
//                    int[] find = {row,col};
//                    return find;
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-404};
    }
}
