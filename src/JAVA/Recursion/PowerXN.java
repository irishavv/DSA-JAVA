package src.JAVA.Recursion;

public class PowerXN {
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

        int power = pow(x, n-1);
        int xpower = x * power;
        return xpower;

    }
}
