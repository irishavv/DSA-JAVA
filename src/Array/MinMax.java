package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMax {
    public static void main(String[] args){
        int[] arr = {4,2,5,7,3,1,19};
        int[] range = {0,0};
        range[0] = min(arr);
        range[1] = max(arr);
        System.out.println(Arrays.toString(range));

    }
    static int min(int[] arr){
        int mini = arr[0];
        for(int i = 0; i< arr.length;i++){
            if(mini > arr[i]){
                mini = arr[i];
            }
        }
        return mini;
    }

    static int max(int[] arr){
        int maxi = arr[0];
        for(int i = 0 ;i<arr.length; i++){
            if(maxi< arr[i]){
                maxi = arr[i];
            }
        }
        return maxi;
    }
}
