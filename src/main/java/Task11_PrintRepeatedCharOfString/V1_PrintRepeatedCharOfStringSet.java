package Task11_PrintRepeatedCharOfString;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class V1_PrintRepeatedCharOfStringSet {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please enter your input:");
        String input = drucker.nextLine();
        LinkedHashSet<Character> someSet = returnDuplicates(input);
        if (someSet == null) {
            System.out.println("There are no duplicates");
        } else {
            for (Character everyChar : someSet) {
                System.out.println(everyChar);
            }
        }


    }

    private static LinkedHashSet<Character> returnDuplicates(String text) {
        char[] myArray = text.toCharArray();
        LinkedHashSet<Character> mySet = new LinkedHashSet<>();
        LinkedHashSet<Character> resultSet = new LinkedHashSet<>();
        for (char c : myArray) {
            if (!mySet.contains(c)) {
                mySet.add(c);
            } else {
                resultSet.add(c);
            }
        }
        if (!resultSet.isEmpty()) {
            return resultSet;
        }
        return null;
    }

}
