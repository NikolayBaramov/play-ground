package Task12_GCDofTwoNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class V1_GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your two numbers separated by space");
        String input = drucker.nextLine();
        if (input.isEmpty() || !input.contains(" ") || input.length() < 3) {
            System.out.println("Invalid input!");
            return;
        }


        int firstNumber;
        int secondNumber;
        try {
            int[] numbers = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            firstNumber = numbers[0];
            secondNumber = numbers[1];
        } catch (Exception e) {
            System.out.println("Invalid input!");
            return;
        }

        int smallerNumber = Math.min(firstNumber, secondNumber);
        for (int i = smallerNumber; i > 0; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                System.out.printf("The greatest common divisor is %d", i);
                break;
            }
        }

    }
}
