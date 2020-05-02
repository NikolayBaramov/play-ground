package Task8_ReverseString;

import java.util.Scanner;

public class V3_ReverseStringStringBuffer {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please enter your input");
        String text = drucker.nextLine();

        StringBuffer myBuffer = new StringBuffer();
        myBuffer.append(text);
        myBuffer.reverse();

        System.out.println(myBuffer);


    }
}
