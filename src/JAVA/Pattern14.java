package src.JAVA;

public class Pattern14 {
    public static void main(Strings[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

//            Stars
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("* ");
            }


            System.out.println();
        }


        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }

//            Stars
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("* ");
            }


            System.out.println();
        }


    }
}
