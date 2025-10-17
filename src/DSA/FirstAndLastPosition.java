package DSA;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {4, 5, 7, 7, 8, 9, 9, 7};
        int target = 3;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums , target,true);
        int end = search(nums , target , false);
        ans[0] = start;
        ans[1] = end;
//        ans[0] = search(nums, target, true);
//        if (ans[0] != -1) {
//            ans[1] = search(nums, target, false);
//        }
        return ans;
    }

    // this function just returns the index value of target
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
