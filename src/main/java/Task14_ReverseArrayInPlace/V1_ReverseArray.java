package Task14_ReverseArrayInPlace;

import java.util.Scanner;

public class V1_ReverseArray {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your input separated by a single space");
        String[] myArray = drucker.nextLine().split("\\s+");
        System.out.println(String.join(" <--> ", reverseArray(myArray)));


    }

    private static String[] reverseArray(String[] input) {
        int length = input.length;

            for (int i = 0; i < length / 2; i++) {
                String temp = input[i];
                input[i] = input[length - i-1];
                input[length - i-1] = temp;
            }

        return input;

    }

}
