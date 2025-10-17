package String;

import java.util.Arrays;
import java.util.Locale;

public class Upper_Lower {
    public static void main(String[] args){
        String Name = "rishav sinha";
        System.out.println(Name);
        Name = Name.toUpperCase();
        System.out.println(Name);
        System.out.println(Name.indexOf("SINHA"));
        System.out.println(Name.replace("RISHAV" ,"SWARNIMA" ));
        System.out.println("                   Rishav".strip());

        String Sentence  = "Ram is a good boy";
        System.out.println(Sentence);

        System.out.println(Arrays.toString(Sentence.split(" ")));
    }
}
