package Numbers;

import java.util.Scanner;

public class multiply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        System.out.println(multiplynumber(num));
        multiplynumber(num);
    }

    public static void multiplynumber(int n){
        int multi=1;
        while(n>0){
            int dig = n % 10;
            multi = multi * dig;
            n=n/10;
        }
        System.out.print(multi);
    }
}
