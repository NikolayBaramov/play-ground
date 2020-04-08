package Task1_FibonacciSeries;

import java.util.Scanner;

public class V1_FibonacciSeries {

    public static void main(String[] args) {
        System.out.println("Enter number upto which Fibonacci series to print: ");

        Scanner drucker = new Scanner(System.in);
        int number = Integer.parseInt(drucker.nextLine());

        int fibFirst = 0;
        int fibSecond = 1;
        int fibonacci = 0;

        System.out.printf("Fibonacci series upto %d numbers:%n",number);

        for (int i = 0; i < number; i++) {

            if (fibonacci == 0 || fibonacci == 1) {
                System.out.print(1 + " ");
            } else {
                System.out.print(fibonacci + " ");
            }
            fibonacci = fibFirst + fibSecond;
            fibFirst = fibSecond;
            fibSecond = fibonacci;
        }

    }
}
