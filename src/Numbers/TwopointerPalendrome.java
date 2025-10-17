package Numbers;

import java.util.Arrays;

public class TwopointerPalendrome {
    public static void main(String[] args){
        int[] num = {1,2,3,2,1};
        System.out.println(isPalendrome(num));

    }

    static boolean isPalendrome(int[] num){
        int start = 0;
        int end = num.length -1;
        while(start < end){
            if(num[start] !=num[end]){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
