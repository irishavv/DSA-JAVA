package Array;
import java.util.Arrays;
public class Swap {
    public static void main(String[] args){
        int[] arr = {2,4,5,7,8,9};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
