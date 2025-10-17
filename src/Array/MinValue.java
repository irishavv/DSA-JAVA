package Array;

public class MinValue {
    public static void main(String[] args){
        int[] arr = {32,65,36,24,-2,83,-74,93,-32};
        System.out.println(min(arr));

    }
    static int min(int[] arr ){
        int MinValue = arr[0];
        for(int i = 1; i< arr.length;i++){
            if(arr[i] < MinValue){
                MinValue = arr[i];
            }
        }
        return MinValue;
    }
}
