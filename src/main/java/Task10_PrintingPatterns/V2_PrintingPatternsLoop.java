package Task10_PrintingPatterns;

import java.util.Scanner;

public class V2_PrintingPatternsLoop {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = Integer.parseInt(drucker.nextLine());
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
