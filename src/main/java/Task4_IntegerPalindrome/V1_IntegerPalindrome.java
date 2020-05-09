package Task4_IntegerPalindrome;

import java.util.Scanner;

public class V1_IntegerPalindrome {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your NUMBER:");
        int number = Integer.parseInt(drucker.nextLine());

        // some change

        if (number < 10 && number > -10) {
            System.out.println(false);
        } else {
            int reversedNumber = Integer.parseInt(reverseNumberAsString(number));

            System.out.println(number + " <--> " + reversedNumber);
            System.out.println(number == reversedNumber);

        }
    }

    private static String reverseNumberAsString(int startNumber) {
        StringBuilder reversed = new StringBuilder();
        while (startNumber != 0) {
            if (startNumber < 0) {
                reversed.append('-');
                startNumber = Math.abs(startNumber);
            }

            reversed.append(startNumber % 10);
            startNumber = startNumber / 10;
        }
        return reversed.toString();
    }

}

