package Task11_PrintRepeatedCharOfString;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class V2_PrintRepeatedCharOfStringMap {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your text");

        String inputText = drucker.nextLine();

        LinkedHashMap<Character, Integer> myMap = new LinkedHashMap<>();
        for (Character eachChar : inputText.toCharArray()) {
            if (!myMap.containsKey(eachChar)) {
                myMap.put(eachChar, 1);
            } else {
                myMap.put(eachChar, myMap.get(eachChar) + 1);
            }
        }

        myMap.entrySet().stream().filter(e -> e.getValue() != 1).forEach(pair -> {
            Character myChar = pair.getKey();
            Integer count = pair.getValue();
            System.out.println(myChar + " : " + count);
        });


    }
}
