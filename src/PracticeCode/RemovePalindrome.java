package PracticeCode;

import java.util.Scanner;

public class RemovePalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine().toLowerCase();

        palindrome1(word);

    }

    public static void palindrome1(String word) {
        int i = 0;
        int j = word.length() - 1;
        boolean palindrome = true;
        int count = 0;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                count++;
                if (count > 1) {
                    palindrome = false;
                    break;
                }
                if (word.charAt(i) == word.charAt(j - 1))
                    j--;
                if (word.charAt(i + 1) == word.charAt(j))
                    i++;
            } else {
                i++;
                j--;
            }
        }
        if (palindrome) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is not palindrome");
        }
    }
}
