package Numbers;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumofnumber(num));

    }

    public static int sumofnumber(int n){
        int sum=0;
        while(n > 0){
            int dig = n % 10;
            sum = sum + dig;
            n = n / 10;
        }
        return sum;
    }
}
