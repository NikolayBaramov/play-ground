package Task9_RemoveDuplicatesFromArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class V2_RemoveDuplicatesSet {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);

        System.out.println("Please enter your values separated by space:");
        String input = drucker.nextLine();
        if (input.isEmpty()||input.equals(" ")){
            System.out.println("Please enter a non empty value");
        } else {
            List<String> myList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());

            HashSet<String> result = new HashSet<>();
            for (String s : myList) {
                result.add(s);
            }

            result.stream().forEach(el-> System.out.print(el+" // "));
        }



    }
}
