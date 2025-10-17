package Array;
import java.util.Arrays;
public class Reverse_Array {
    public static void main(String[] args){
        int[] arr = {2,6,5,7,8,9};
        int[] reverse = new int[arr.length];
        for(int i = 0;i < arr.length;i++){
            reverse[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
