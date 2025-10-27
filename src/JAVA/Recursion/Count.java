package src.JAVA.Recursion;

public class Count {
    public static void main(String[] args) {
        int num = 1;
        count(num);
    }

    public static void count(int num){
        if(num == 6){
            return;
        }
        System.out.println(num);
        count(num+1);
    }
}
