package Task18_StringAnagram;

import java.util.Arrays;
import java.util.Scanner;

public class V1_StringAnagram {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your first String");
        String firstString = drucker.nextLine();
        System.out.println("Please enter your second String");
        String secondString = drucker.nextLine();

        System.out.println(isItAnagram(firstString, secondString));


    }

    private static boolean isItAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }

        char[] arrayOne = first.toCharArray();

        for (int i = 0; i < arrayOne.length; i++) {
            if (Character.isLetter(arrayOne[i])) {
                arrayOne[i] = Character.toLowerCase(arrayOne[i]);
            }
            // тук правя всички букви малки -> army и Mary трябва да връщат true
        }

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = i + 1; j < arrayOne.length; j++) {
                if (arrayOne[j] < arrayOne[i]) {
                    char temp = arrayOne[i];
                    arrayOne[i] = arrayOne[j];
                    arrayOne[j] = temp;
                }
                // така сортирам CharArray по азбучен ред - доста извратено
            }
        }

        char[] arrayTwo = second.toCharArray();

        for (int i = 0; i < arrayTwo.length; i++) {
            if (Character.isLetter(arrayTwo[i])) {
                arrayTwo[i] = Character.toLowerCase(arrayTwo[i]);
            }
            // тук правя всички букви малки -> army и Mary трябва да връщат true
        }

        Arrays.sort(arrayTwo);
        // алтернативно сортиране по азбучен ред - доста по-изтънчено

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                return false;
            }
        }
        return true;
    }


}
