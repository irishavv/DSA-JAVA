package Patterns;

public class InvertedRightriangle {
    public static void main(String[] args){
        invertedRightTriangle1(6);
    }
    public static void invertedRightTriangle1(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
