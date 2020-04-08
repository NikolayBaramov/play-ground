package Task1_FibonacciSeries;

import java.util.Scanner;

public class V2_FibonacciSeriesRecursive {

    public static void main(String[] args) {
        System.out.println("Enter number upto which Fibonacci series to print: ");
        Scanner drucker = new Scanner(System.in);

        int number = Integer.parseInt(drucker.nextLine());

        System.out.printf("Fibonacci series upto %d numbers:%n", number);

        for (int i = 0; i < number; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }


    }

    private static int fibonacciRecursive(int myNumber) {
        if (myNumber == 0 || myNumber == 1) {
            return 1;
        }

        return fibonacciRecursive(myNumber - 1) + fibonacciRecursive(myNumber - 2);
    }


}
