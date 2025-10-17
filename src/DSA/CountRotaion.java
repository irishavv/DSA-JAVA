package DSA;

public class CountRotaion {
    public static void main(String[] args) {
//        int[] arr = {12,15,18,2,3,6};
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Searchpivot(arr)+1);
    }

    static int Searchpivot(int[] arr){
        int start = 0;
        int end = arr.length-1 ;

        while(start <= end ){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid] <= arr[start]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;

    }
}
