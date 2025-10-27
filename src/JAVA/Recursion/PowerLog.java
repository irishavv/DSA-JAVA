package src.JAVA.Recursion;

public class PowerLog {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int result = pow(x, n);
        System.out.println(result);
    }

    public static int pow(int x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }

        if(n % 2 == 0){
            return pow(x, n/2) * pow(x, n/2);
        }else{
            return pow(x, n/2) * pow(x, n/2) * x;
        }

    }
}
