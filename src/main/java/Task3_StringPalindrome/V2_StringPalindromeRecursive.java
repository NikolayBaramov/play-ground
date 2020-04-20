package Task3_StringPalindrome;

import java.util.Scanner;

public class V2_StringPalindromeRecursive {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        String input = "reverseMe";

        System.out.println(isItPalindrome(input));
        System.out.println(input + " <--> " + reverseIt(input));


    }

    private static boolean isItPalindrome(String txt) {
        if (txt.equals(reverseIt(txt))) {
            return true;
        }
        return false;
    }

    private static String reverseIt(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        text = text.substring(text.length() - 1) + reverseIt(text.substring(0, text.length() - 1));
        return text;
    }

}
