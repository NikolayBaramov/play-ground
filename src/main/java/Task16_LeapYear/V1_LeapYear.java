package Task16_LeapYear;

import java.util.Scanner;

public class V1_LeapYear {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter a year you want to check.");
        int year = Integer.parseInt(drucker.nextLine());
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.printf("The year %d is a leap year", year);
        } else {
            System.out.printf("The year %d is NOT a leap year", year);
        }


    }
}
