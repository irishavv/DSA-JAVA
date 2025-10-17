package Recursion;

public class sortedOrnot {
    public static void main(String[] args){
        int[] num = {1,2,4,4,5,6};
        System.out.println(ischeck(num , 0));

    }

    static boolean ischeck(int[] num, int index){
        if(index == num.length-1){
            return true;
        }
        return num[index] <= num[index + 1] && ischeck(num, index+1);
    }
}
