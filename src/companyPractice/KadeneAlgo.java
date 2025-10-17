package companyPractice;

public class KadeneAlgo {
    public static void main(String[] args){
        int[] arr = {-2,-6,-2,-9,1,4,3,7,6};
        int ans = max(arr);
        System.out.println(ans);

    }
    static int max(int[] arr){
        int current = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            current = current + arr[i];
            maxSum = Math.max(current , maxSum);
            if(current < 0){
                current = 0;
            }
        }
        return maxSum;
    }

}
