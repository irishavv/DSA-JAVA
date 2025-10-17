package Array;
import java.util.Arrays;
public class Reverse_Array_swap {
    public static void main(String[]args){
        int[] arr ={1,2,3,4};
        int start = 0;
        int end = arr.length-1;
        int temp ;
        while(start<end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
        }
        System.out.print(Arrays.toString(arr));
    }

}