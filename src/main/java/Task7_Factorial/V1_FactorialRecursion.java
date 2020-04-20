package Task7_Factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class V1_FactorialRecursion {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please enter your number:");

        int inputNumber = Integer.parseInt(drucker.nextLine());
        System.out.println(calculateFactorial(inputNumber));


    }

    private static BigInteger calculateFactorial(int numb) {
        if (numb == 0) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(numb).multiply(calculateFactorial(numb-1));
    }

}
