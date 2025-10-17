package DSA;

import java.util.*;

public class Sliding_Window {
    public static void main(String[] args) {
        Sliding_Window sw = new Sliding_Window();

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = sw.maxSlidingWindow(nums, k);

        System.out.println("Sliding window maximums:");
        System.out.println(Arrays.toString(result));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove indices outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove indices of elements smaller than current element
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.offerLast(i);

            // Add max for full window
            if (i >= k - 1) {
                res.add(nums[dq.peekFirst()]);
            }
        }

        // Convert result list to array
        return res.stream().mapToInt(i -> i).toArray();
    }
}
