package companyPractice;

import java.util.*;

public class Anagram1 {

    public static void main(String[] args) {
        List<String> anagrams = getAnagrams("word");
        for (int i = 0; i < anagrams.size(); i++) {
            String s = anagrams.get(i);
            System.out.println(s);
        }
    }
    static List<String> getAnagrams(String input) {
        List<String> result = new ArrayList<>();
        backtrack("", input, result);
        return result;
    }

    private static void backtrack(String prefix, String remaining, List<String> result) {
        if (remaining.length() == 0) {
            result.add(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            backtrack(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), result);
        }
    }
}
