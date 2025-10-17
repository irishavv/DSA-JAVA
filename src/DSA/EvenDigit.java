package DSA;

public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = {12, 345, 938, 28, 3829, 823, 923748};
        int count = 0;

        // Inline the counting logic without any extra methods
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int digits = 0;
            while (num != 0) {
                digits++;
                num /= 10;
            }
            if (digits % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even digits: " + count);
    }
}
