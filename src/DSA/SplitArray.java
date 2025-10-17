package DSA;

public class SplitArray {
    public static void main(String[] args) {

        int[] nums = {7, 2, 5, 10, 8}; // Sample input array
        int k = 2; // Number of subarrays

        int result =  splitArray(nums, k);

        System.out.println(result);
    }


    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // max element in nums
            end += nums[i]; // sum of all elements
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;

            for (int i = 0; i < nums.length; i++) {
                if (sum + nums[i] > mid) {
                    sum = nums[i];
                    pieces++;
                } else {
                    sum += nums[i];
                }
            }

            if (pieces > k) {
                start = mid + 1; // need bigger pieces (increase allowed max sum)
            } else {
                end = mid; // fewer or exact pieces, try reducing max sum
            }
        }

        return end; // or return start; both are equal here
    }


}
