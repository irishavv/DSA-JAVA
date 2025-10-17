package DSA;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,4,8,23,45,49,56,59,66,74,78,80,84,86,90,94,95,99};
        int target = 91;
        int result = BinarySearchNumber(arr , target);
        System.out.println(result);
    }

    static int BinarySearchNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start+(end - start)/2;
            if(target< arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return  -1;
    }
}
