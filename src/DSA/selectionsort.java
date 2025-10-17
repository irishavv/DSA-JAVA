package DSA;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args){
        int[] arr = {4,5,1,2,3};
        System.out.println(Arrays.toString(selection(arr)));
    }

    static int[] selection(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
