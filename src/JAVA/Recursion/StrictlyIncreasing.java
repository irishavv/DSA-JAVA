package src.JAVA.Recursion;

public class StrictlyIncreasing {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,6,7,8};
        int idx = 0;

        System.out.println(isSorted(arr,idx));
    }

    public static Boolean isSorted(int[] arr, int idx) {
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }else {
            return false;
        }

    }
}
