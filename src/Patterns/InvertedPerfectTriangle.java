package Patterns;

public class InvertedPerfectTriangle {
    public static void main(String[] args){
        invertedPtrangle(5);
    }
    public static void invertedPtrangle(int n){
        for(int i=n; i>0;i--){
            for(int j=0; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
