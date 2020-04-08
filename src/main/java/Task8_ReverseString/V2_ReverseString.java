package Task8_ReverseString;

import java.util.Scanner;

public class V2_ReverseString {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your text");

        String inputText = drucker.nextLine();
        System.out.println(reverseText(inputText));


    }

    private static String reverseText(String input) {
        String result = "";
        int counter = input.length();
        for (int i = 0; i < counter; i++) {
            result = result + input.substring(counter - 1 - i);
            input = input.substring(0, counter - 1 - i);
        }
        return result;
    }

}
