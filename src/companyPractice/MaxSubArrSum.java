package companyPractice;

public class MaxSubArrSum {
    public static void main(String[] args){
        int[] arr = {-5,-6,9,1, 2, 3, 4, 5, 6};
        int maxsum = 0;

        for (int st = 0; st < arr.length; st++) {
            int currentsum = 0;
            for (int end = st; end < arr.length; end++) {
                currentsum = currentsum + arr[end];
                maxsum = Math.max(currentsum, maxsum);
            }
        }

        System.out.println("Max subarr sum: " + maxsum);
    }
}
