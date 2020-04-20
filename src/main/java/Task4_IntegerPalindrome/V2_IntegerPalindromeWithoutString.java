package Task4_IntegerPalindrome;

import java.util.Scanner;

public class V2_IntegerPalindromeWithoutString {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your NUMBER:");
        int number = Integer.parseInt(drucker.nextLine());
        int reversedNumber = reverseNumber(number);

        System.out.println(number + " <--> " + reversedNumber);
        System.out.println(number == reversedNumber);


    }

    private static int reverseNumber(int input) {
        int result = 0;
        while (input != 0) {
            int lastDigit = input % 10;
            result = result * 10 + lastDigit;
            input = input / 10;


        }
        return result;
    }

}
