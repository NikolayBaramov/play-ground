package Task15_ReverseWordsOfSentence;

import java.util.Scanner;

public class V1_ReverseWordsSentence {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String text = drucker.nextLine();
        String [] result = reverseWords(text);
        System.out.print(String.join(" ", result));

    }

    private static String[] reverseWords(String sentence) {
        String[] myArray = sentence.split("\\s+");
        for (int i = 0; i < myArray.length / 2; i++) {
            String temp = myArray[i];
            myArray[i] = myArray[myArray.length - 1 - i];
            myArray[myArray.length - 1 - i] = temp;
        }
        return myArray;
    }

}
