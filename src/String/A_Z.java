package String;

public class A_Z {
    public static void main(String[] args){
        String Alphabet = "";
        for(int i = 0; i< 26;i++){
            char ch = (char)('a' + i);
            Alphabet = Alphabet +' ' +  ch;
        }
        System.out.println(Alphabet);
    }
}
