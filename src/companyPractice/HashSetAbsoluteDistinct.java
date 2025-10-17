package companyPractice;

import java.util.*;

public class HashSetAbsoluteDistinct {
    public static void main(String[] args){
        int[] nums = {-4, -4, -3, -3, -1, 0, 1, 2, 3, 3, 4};

        Set<Integer> absoluteNum = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            absoluteNum.add(Math.abs(nums[i]));
        }

        System.out.println("Count: " + absoluteNum.size());
    }
}
