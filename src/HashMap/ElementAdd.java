package HashMap;

import java.util.HashMap;

public class ElementAdd {
    public static void main(String[] args){

        HashMap<String,Integer> Marks = new HashMap<>();
         Marks.put("Rishav",94);
        Marks.put("Sinha",97);
        Marks.put("Swarnima",99);
        Marks.put("Sanju",98);

        System.out.println(Marks);
        System.out.println(Marks.get("Swarnima"));
        System.out.println(Marks.containsKey("Sanju"));
    }
}
