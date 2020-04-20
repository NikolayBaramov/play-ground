package Task9_RemoveDuplicatesFromArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class V1_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your values separated by space:");
        String inputs = drucker.nextLine();

        List<String> myList = new LinkedList<>();
        myList = Arrays.stream(inputs.split(" ")).collect(Collectors.toList());
        List<String> resultList = new LinkedList<>();
        for (String eachValue : myList) {
            if (!resultList.contains(eachValue)){
                resultList.add(eachValue);
            }
        }

        resultList.stream().forEach(el-> System.out.println(el));




    }
}
