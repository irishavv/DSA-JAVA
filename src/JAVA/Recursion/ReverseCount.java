package src.JAVA.Recursion;

public class ReverseCount {
    public static void main(String[] args) {
        int num = 10;
        reverseCount(num);
    }

    public static void reverseCount(int num){
        if(num == 0){
            return;
        }

        System.out.println(num);
        reverseCount(num-1);
    }
}
