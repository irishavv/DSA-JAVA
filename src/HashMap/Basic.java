package HashMap;

public class Basic {
    public static void main(String[] args){
        String name = "Rishav Sinha";
        int Code = name.hashCode();
        System.out.println(Code);

        Integer num = 123213;
        int code = num.hashCode();
        System.out.println(code);
    }
}
