package Task2_PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        int number = Integer.parseInt(drucker.nextLine());

        double squareRouteOfTheNumber = Math.sqrt(number);

        boolean isItPrime = true;

        for (int i = 2; i <= squareRouteOfTheNumber; i++) {
            if (number % i == 0) {
                isItPrime = false;
                break;
            }
        }

       if (isItPrime){
           System.out.printf("The number %d is a prime number",number);
       } else {
           System.out.printf("The number %d is NOT a prime number",number);
       }


    }
}
