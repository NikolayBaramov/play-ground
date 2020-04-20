package Task16_LeapYear;

import java.util.Calendar;
import java.util.Scanner;

public class V2_LeapYearCalendar {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter a year you want to check.");
        int year = Integer.parseInt(drucker.nextLine());
        if (isItLeapYear(year)){
            System.out.printf("The year %d is a leap year",year);
        }else {
            System.out.printf("The year %d is NOT a leap year", year);
        }

    }

    private static boolean isItLeapYear (int input){
        Calendar myCalender = Calendar.getInstance();
        myCalender.set(Calendar.YEAR,input);
        int numberOfDays = myCalender.getActualMaximum(Calendar.DAY_OF_YEAR);
        return numberOfDays != 365;
    }

}
