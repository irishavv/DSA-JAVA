package src.JAVA.Recursion;

public class TOH {
    static int count = 0;
    public static void main(String[] args) {
        int n = 8;

        towerOfHanoi(n,"S","H","D");
        System.out.println("Total Steps = "+ count);

    }

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            count++;
            System.out.println("Transfer disk" + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        count++;
        System.out.println("Transfer disk" + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);

    }


}
