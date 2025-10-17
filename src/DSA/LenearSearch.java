package DSA;
public class LenearSearch {
    public static void main(String[] args){
        int[] arr = {2,5,7,37,83,62,35,47};
        int target = 37;
        int result = search(arr,target);
        int elementresult = elementsearch(arr,target);
        System.out.println("Index Number is: " +result);
        System.out.println("The element is: "+ elementresult);


    }
    static int elementsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int num = arr[index];
            if(num == target){
                return num;
            }
        }
        return -1;
    }


    static int search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            int num = arr[index];
            if(num == target){
                return index;
            }
        }
        return -1;
    }
}
