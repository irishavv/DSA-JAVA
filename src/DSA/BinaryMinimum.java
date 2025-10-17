package DSA;

import java.util.Arrays;

public class BinaryMinimum {
    public static void main(String[] args) {
//        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int[] arr = {4, 5, 6, 7};
        System.out.println(Find(arr));
    }

    static int Find(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid + 1 < arr.length && arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            } else if (mid - 1 >= 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (arr[end] < arr[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return arr[end];
    }
}
