package Recursion;

public class ProductOfDigit {
    public static void main(String[] args){
        int result = prod(13420);
        System.out.println(result);
    }
    static int prod(int num){
        if(num%10 == num){
            return num;
        }
        return (num%10) * prod(num/10);
    }
}
