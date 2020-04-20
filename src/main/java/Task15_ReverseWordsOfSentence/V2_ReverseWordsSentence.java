package Task15_ReverseWordsOfSentence;

import java.util.*;
import java.util.stream.Collectors;

public class V2_ReverseWordsSentence {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String text = drucker.nextLine();
        System.out.println(reverseIt(text));


    }
    private static String reverseIt (String input){
        LinkedList<String> myList = Arrays.stream(input.split("\\s+"))
                .collect(Collectors.toCollection(LinkedList::new));
        //така се създава LinkedList от stream

        Collections.reverse(myList);
        //така обръщам листа
        StringBuilder sb = new StringBuilder();
        for (String s : myList) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }

}
