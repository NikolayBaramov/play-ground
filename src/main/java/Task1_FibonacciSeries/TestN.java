package Task1_FibonacciSeries;

import java.util.Scanner;

public class TestN {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please write your number:");

        int givenNumber = Integer.parseInt(drucker.nextLine());

        for (int i = 0; i < givenNumber; i++) {
            int result = calculateFib(i);
            System.out.print(result + " ");
        }

    }

    private static int calculateFib(int numb) {
        int fibonacci;

        if (numb > 1) {
            fibonacci = calculateFib(numb - 1) + calculateFib(numb - 2);
            return fibonacci;
        }
        return 1;
    }


}
