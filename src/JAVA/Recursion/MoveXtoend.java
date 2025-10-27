package src.JAVA.Recursion;

public class MoveXtoend {
    public static void main(String[] args) {
        String str = "axbxsxbcxxn";
        moveXtoend(str,0,0,"");
    }

    public static void moveXtoend(String str, int idx, int count, String newString) {

        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newString = newString + 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveXtoend(str, idx+1, count, newString);
        }else {
            newString = newString + currChar;
            moveXtoend(str, idx+1, count, newString);
        }
    }
}
