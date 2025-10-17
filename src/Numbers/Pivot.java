package Numbers;

public class Pivot {
    public static void main(String[] args) {
        int[] arr = {4,4,5,5,5,6,6,7,7,7,8,8,1,2,2,3,3,3,4};  // Change this to test other scenarios
        int pivotIndex = pivot(arr);

        if (pivotIndex == -1) {
            System.out.println("Array is sorted and not rotated.");
        } else {
            System.out.println("Pivot found at index: " + pivotIndex + ", Value: " + arr[pivotIndex]);
        }
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Check if the array is already sorted and not rotated
        if (arr[start] < arr[end]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Handle duplicates: skip one step from both ends
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // Check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Left side is sorted, pivot is in right half
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else { // Pivot is in left half
                end = mid - 1;
            }
        }

        return -1; // No pivot found (sorted, not rotated)
    }
}
