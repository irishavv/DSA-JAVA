package companyPractice;
import java.util.*;

public class firstUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 5};

        Set<Integer> Number = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < nums.length ; i++) {
            if (Number.contains(nums[i])) {
                duplicates.add(nums[i]);

            } else {
                Number.add(nums[i]);
            }
        }
        Number.removeAll(duplicates);
//        System.out.println(Number);

//        for (int i = 0; i < nums.length ; i++) {
//            if (Number.contains(nums[i])) {
//                System.out.println("First unique element: " + nums[i]);
//                break;
//            }
//        }
        Integer[] arr = Number.toArray(new Integer[0]);
        System.out.println(arr[0]);
    }
}
