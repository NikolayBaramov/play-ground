package Task18_StringAnagram;

import java.util.Arrays;
import java.util.Scanner;

public class V2_StringAnagram {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please insert your first String.");

        String firstString = drucker.nextLine();
        System.out.println("Please insert your second String.");
        String secondString = drucker.nextLine();

        System.out.println(isAnagram(firstString, secondString));


    }

    public static boolean isAnagram(String firstS, String secondS) {
        if (firstS.length() != secondS.length()) {
            return false;
        }


        char[] firstArray = firstS.toCharArray();
        for (int i = 0; i <firstArray.length ; i++) {
            if (Character.isLetter(firstArray[i])){
                firstArray[i]=Character.toLowerCase(firstArray[i]);
            }
        }
        Arrays.sort(firstArray);

        char[] secondArray = secondS.toCharArray();
        for (int i = 0; i <secondArray.length ; i++) {
            if (Character.isLetter(secondArray[i])){
                secondArray[i]=Character.toLowerCase(secondArray[i]);
            }
        }
        Arrays.sort(secondArray);

        return Arrays.equals(firstArray, secondArray);
    }

}
