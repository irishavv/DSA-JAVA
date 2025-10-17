package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {
    public static void main(String[] args){
        int[] numbers = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] result =  target(numbers,index);
        System.out.println(Arrays.toString(result));
    }

    static int[] target(int[] numbers, int[] index){
        List<Integer> Target = new ArrayList<>();
        for(int i = 0; i< numbers.length; i++ ){
            Target.add(index[i],numbers[i]);
        }
        int[] target1 = new int[numbers.length];
        for(int i = 0;i<numbers.length;i++){
            target1[i] = Target.get(i);
        }
        return target1;
    }
}
