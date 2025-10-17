package Patterns;

public class InvertedRRightTriangle {
    public static void main(String[] args) {
        invertrrighttriangle(5);
    }

    public static void invertrrighttriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}