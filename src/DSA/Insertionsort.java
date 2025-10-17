package DSA;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args){
        int[] arr = {5, 3, 1, 4, 2};
        System.out.println(Arrays.toString(insertion(arr)));
    }

    static int[] insertion(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}
