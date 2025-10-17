package Array;
import java.util.Scanner;
public class TwoDPrint {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scan.nextInt();
            }
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(java.util.Arrays.toString(array[i]));
        for(int i =0; i<array.length;i++){
            for(int j = 0; j<array[i].length;j++){
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
