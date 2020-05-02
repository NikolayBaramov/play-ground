package Task8_ReverseString;

import java.util.Scanner;

public class V4_ReverseStringRecursive {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please enter your input:");
        String text = drucker.nextLine();

        System.out.println(reverseStringRecursive(text));


    }

    private static String reverseStringRecursive(String someText) {
        if (someText.length() < 2) {
            return someText;
        }
        return reverseStringRecursive(someText.substring(1))+someText.charAt(0);

    }

}
