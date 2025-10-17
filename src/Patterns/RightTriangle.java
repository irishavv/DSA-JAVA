package Patterns;

public class RightTriangle {
    public static void main(String[] args){
        rightTriangle1(3);
    }
    public static void rightTriangle1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
