package DSA;

public class Ceiling_binarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,8,9,10,13,14,15,16,19,20};
        int target = 12;

        int result = ceiling(arr , target);
        System.out.println(result);
    }

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start];
    }
}
