package Array;

public class MaxValue {
    public static void main(String[] args){
        int[] arr = {23,45,34,99,75,12,98};
        System.out.println(max(arr));

    }
    public static int max(int[] arr ){
        int MaxVal = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(arr[i]> MaxVal){
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
}
