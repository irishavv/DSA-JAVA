package src.JAVA.Recursion;

public class SumNatural {
    public static void main(String[] args) {
        int num = 1;
        int result = sumNatural(num);
        System.out.println(result);

    }

    public static int sumNatural(int num){

        if(num == 10){
            return 10;
        }

        return num + sumNatural(num+1);

    }
}
