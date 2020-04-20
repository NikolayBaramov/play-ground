package Task13_SquareRootOfNumber;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class V1_SquareRootOfNumber_G {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please write your number");
        int numb = Integer.parseInt(drucker.nextLine());
        NumberFormat myFormat =  new DecimalFormat("#.####");
        double answer = findMySquareRoot(numb);
        System.out.printf("The square root of %d is %s%n",numb,myFormat.format(answer));

    }

    private static double findMySquareRoot(int inputNumb) {
        double result = inputNumb / 2.0;
        double temp = 0.0;

        while (result != temp) {
            temp = result;
            result = (temp + inputNumb / temp) / 2;
        }
        return result;
    }

}
