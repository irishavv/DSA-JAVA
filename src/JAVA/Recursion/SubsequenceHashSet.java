package src.JAVA.Recursion;

import java.util.HashSet;

public class SubsequenceHashSet {
    public static void main(String[] args) {
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        subsequenceString(str, 0, "", set);
    }

    public static void subsequenceString(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if(set.contains(newString)) {
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }

        char currChar = str.charAt(idx);
        subsequenceString(str, idx + 1, newString + currChar, set);

        subsequenceString(str, idx + 1, newString, set);
    }
}
