package PracticeCode;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(palindromestring(word));

    }
    public static boolean palindromestring(String word){
        String newword = word;
        char chr;
        String reverse = "";
        for(int i = word.length()-1; i>=0;i--){
            chr = word.charAt(i);
            reverse = reverse + chr;
        }
        System.out.println(reverse);
        if(newword.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
}