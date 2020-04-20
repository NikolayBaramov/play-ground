package Task19_FirstAndReserveTeam_SU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        int number = Integer.parseInt(drucker.nextLine());

        Team someTeam = new Team("JavaTeam");

        for (int i = 0; i < number ; i++) {
            String [] inputArray = drucker.nextLine().split("\\s+");
            Person p = new Person(inputArray[0],inputArray[1],Integer.parseInt(inputArray[2]));
            someTeam.addPlayer(p);
        }


        System.out.printf("First team have %d players%n",someTeam.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n",someTeam.getSecondTeam().size());



    }
}
