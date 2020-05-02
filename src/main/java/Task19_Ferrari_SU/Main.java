package Task19_Ferrari_SU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please write the name of the driver.");
        String input = drucker.nextLine();

        Ferrari myFerrari = new Ferrari(input);
        System.out.println(myFerrari.toString());




    }
}
