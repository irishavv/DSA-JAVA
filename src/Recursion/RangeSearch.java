package Recursion;

import java.util.ArrayList;

public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        int target = 4;

        ArrayList<Integer> result = find(arr, target, 0, new ArrayList<>());
        System.out.println(result);
    }

    static ArrayList<Integer> find(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return find(arr, target, index + 1, list);
    }
}
