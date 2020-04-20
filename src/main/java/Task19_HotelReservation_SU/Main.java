package Task19_HotelReservation_SU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner drucker = new Scanner(System.in);
        String [] inputAsArray = drucker.nextLine().split("\\s+");
        double price = Double.parseDouble(inputAsArray[0]);
        int days = Integer.parseInt(inputAsArray[1]);
        String season = inputAsArray[2];
        String discountType = inputAsArray[3];

        PriceCalculator calc = new PriceCalculator(price,days,season,discountType);
        System.out.printf("%.2f%n",calc.calculateThePrice());




    }
}
