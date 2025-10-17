package Array;

public class Count_even_odd {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,7,8,6,4,22,96,47};
        int EvenCount = 0;
        int OddCount = 0;
        for(int i =0;i< arr.length;i++){
            if(arr[i]%2 == 0){
                EvenCount++;
            }
            else{
                OddCount++;
            }
        }
        System.out.println("Total Even Count: " + EvenCount);
        System.out.println("Total Odd Count: " + OddCount);
    }
}
