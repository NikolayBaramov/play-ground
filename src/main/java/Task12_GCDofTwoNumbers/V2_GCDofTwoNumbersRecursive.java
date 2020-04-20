package Task12_GCDofTwoNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class V2_GCDofTwoNumbersRecursive {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter two numbers, separated by space");
        String input = drucker.nextLine();
        if (input.length() < 3 || !input.contains(" ")) {
            System.out.println("Invalid input");
            return;
        }

        try {
            int[] numbers = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            int firstNumber = numbers[0];
            int secondNumber = numbers[1];
            System.out.printf("The GCD is: %d", findGCDRecursive(firstNumber,secondNumber));
            System.out.println(9%27);

        } catch (Exception e) {
            System.out.println("Invalid input!");
        }


    }

    private static int findGCDRecursive(int first, int second) {

        if (second == 0) {
            return first;
        }
       return findGCDRecursive(second, first % second);
    }

}
