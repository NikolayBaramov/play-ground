package Task10_PrintingPatterns;

import java.util.Scanner;

public class V1_PrintingPatterns {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = Integer.parseInt(drucker.nextLine());

        for (int i = 1; i <= n ; i++) {
            System.out.println(repeatStr("* ", i));
        }
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder textToReturn = new StringBuilder();
        for (int i = 0; i < count; i++) {
            textToReturn.append(strToRepeat);
        }
        return textToReturn.toString();
    }

}
