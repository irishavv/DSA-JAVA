package DSA;

public class InfiniteBS {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,7,8,9,10,12,13,15,17,19,20,21,22,25,27,29,30,31,32,36,37,38,39,40,41,42,44,47,49,50};
        int target = 29;
        System.out.println(result(arr , target));

    }
    static int result(int[] arr, int target){
        //Setting initial start and End which will change according to there finding
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end-start+1)*2;
            start = temp;
        }
        return Binarysearch(arr , target , start , end);
    }

    static int Binarysearch(int[] arr , int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
