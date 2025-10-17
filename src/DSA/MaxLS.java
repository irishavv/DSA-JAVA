package DSA;

import java.util.Arrays;

public class MaxLS {
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,88},
                {73,48,59,60}
        };
        int result = search(arr);
        System.out.println(result);
    }

    static int search(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row< arr.length;row++){
            for(int col = 0; col< arr[row].length;col++){
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
