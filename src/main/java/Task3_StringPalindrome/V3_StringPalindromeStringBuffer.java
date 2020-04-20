package Task3_StringPalindrome;

import java.util.Scanner;

public class V3_StringPalindromeStringBuffer {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please enter your data:");
        String txt = drucker.nextLine();


        if (txt == null || txt.isEmpty()) {
            System.out.println("Invalid input!");
        } else {
            System.out.println(reverseChars(txt));
        }


    }

    private static String reverseChars(String input) {
        StringBuilder sb = new StringBuilder();
        char[] myChars = input.toCharArray();
        for (int i = myChars.length - 1; i >= 0; i--) {
            sb.append(myChars[i]);
        }
        return sb.toString();
    }

}
