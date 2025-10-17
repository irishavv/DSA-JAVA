package companyPractice;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        getAnagrams("Rishav").forEach(System.out::println);
    }

    public static Set<String> getAnagrams(String s) {
        if (s.length() <= 1) return Set.of(s);
        Set<String> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i + 1);
            for (String sub : getAnagrams(rest))
                result.add(ch + sub);
        }
        return result;
    }
}
