package Task5_ArmstrongNumber;

import java.util.Scanner;

public class V1_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please enter your number:");

        int numberToCheck = Integer.parseInt(drucker.nextLine());
        System.out.println(armstrongChecker(numberToCheck));


    }

    private static boolean armstrongChecker(int numb) {
        double armstrongCandidate = 0.0;
        int startNumb = numb;

        while (numb != 0) {
            armstrongCandidate = armstrongCandidate + Math.pow(numb % 10, 3);
            numb = numb / 10;
        }
        return armstrongCandidate == startNumb;
    }

}
