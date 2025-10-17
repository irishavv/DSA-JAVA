package Numbers;

public class reversecount {
    public static void main(String[] args){
        revcounting(16);
    }

    public static void revcounting(int n){
        for(int i = n; i>=0; i--){
            System.out.print(i + " ");
        }
    }
}
