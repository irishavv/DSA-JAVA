package Patterns;

public class PrefectTriangle {
    public static void main(String[] args){

        Ptrangle(6);
    }
    public static void Ptrangle(int n){
        for(int  i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
