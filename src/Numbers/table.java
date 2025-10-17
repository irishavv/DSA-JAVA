package Numbers;

public class table {
    public static void main(String[] args) {
        tab(6);
    }

    public static void tab(int n){
        int num = n;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num * i);
        }
    }
}