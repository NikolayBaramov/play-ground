package Task7_Factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class V2_FactorialIteration {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please enter your number:");
        int inputNumber = Integer.parseInt(drucker.nextLine());

        System.out.println(calcFactorial(inputNumber));

    }

    private static BigInteger calcFactorial(int numb) {
        BigInteger result = BigInteger.valueOf(1);
        while (numb > 0) {
            result = result.multiply(BigInteger.valueOf(numb));
            numb--;
        }
        return result;
    }

}
