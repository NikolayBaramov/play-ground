package Task1_FibonacciSeries;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class V3_FibonacciSeriesMemoization {

    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Enter number upto which Fibonacci series to print: ");

        int number = Integer.parseInt(drucker.nextLine());

        LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

        System.out.printf("Fibonacci series upto %d numbers:%n", number);

        for (int i = 0; i < number; i++) {
            Integer fibonacci;

            if (i == 0 || i == 1) {
                System.out.print(1 + " ");
                cache.put(i, 1);
                continue;
            }

            fibonacci = cache.get(i - 1) + cache.get(i - 2);
            cache.put(i, fibonacci);

            System.out.print(fibonacci + " ");
        }

    }

}
