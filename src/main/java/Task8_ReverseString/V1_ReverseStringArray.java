package Task8_ReverseString;

import java.util.Scanner;

public class V1_ReverseStringArray {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please enter your text");
        String inputString = drucker.nextLine();

        System.out.println(reverseIt(inputString));


    }

    private static String reverseIt(String input) {
        if (input == null || input.isEmpty()) {
            return "damn";
        }
        char[] myArray = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = myArray.length - 1; i >= 0; i--) {
            result.append(myArray[i]);
        }
        return result.toString();
    }

}
