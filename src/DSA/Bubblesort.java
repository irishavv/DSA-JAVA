package DSA;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        boolean swaping;
        for (int i = 0; i < arr.length - 1; i++) {
            swaping = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swaping = true;
                }
            }
            if(!swaping){
                break;
            }
        }
        return arr;
    }
}
