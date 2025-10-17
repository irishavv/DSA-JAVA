package Patterns;

public class RRightTriangle {
    public static void main(String[] args){
        rrighttrangle(5);
    }
    public static void rrighttrangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
