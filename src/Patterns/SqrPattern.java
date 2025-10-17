package Patterns;

public class SqrPattern {
    public static void main(String[] args){
        squarePattern(7);
    }
    public static void squarePattern(int n){
        for(int i = n;i>0;i--){
            System.out.print("* ");
        }
        System.out.println();

        for(int j=0; j<n-2; j++){
            System.out.print("* ");
            for(int i=0; i<n-2; i++){
                System.out.print("  ");
            }
            System.out.println("*");
        }

        for(int i = n;i>0;i--){
            System.out.print("* ");
        }
    }

}
