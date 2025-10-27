package src.JAVA.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        long result = findFactorial(n);
        System.out.println(result);
    }

    public static long findFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}
