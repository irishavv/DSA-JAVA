package DSA;
import java.util.Arrays;

public class DigitsEven {
    public static void main(String[] args) {
        int[] arr = {12, 345, 938, 28,3829,823,923748};
        int result = EvenDigit(arr);
        System.out.println("Even digits: " + result);
    }

    static int EvenDigit(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
