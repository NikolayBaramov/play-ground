package Task3_StringPalindrome;

import java.util.Scanner;

public class V1_StringPalindrome {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your input:");
        String input = drucker.nextLine();
        input = input.toLowerCase();

        boolean isItPalindrome = true;

        int wordLength = input.length();

        if (wordLength == 1) {
            isItPalindrome = false;
        } else {
            for (int i = 0; i < wordLength / 2; i++) {
                if (input.charAt(i) != input.charAt(wordLength - 1 - i)) {
                    isItPalindrome = false;
                    break;
                }
            }
        }

        if (!isItPalindrome) {
            System.out.println("No att all!");
        } else {
            System.out.println("Yes baby!");
        }


    }
}
