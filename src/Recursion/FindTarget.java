package Recursion;

public class FindTarget {
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,8,9,10,28,49};
        int target = 10;

        System.out.println(find(arr,target , 0));
    }
    static int find(int[] arr, int target, int index){
        if(index == arr.length-1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return find(arr , target , index +1);
    }
}
