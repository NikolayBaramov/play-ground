package Task17_BinarySearch;

import java.util.Scanner;

public class V1_BinarySearch_G {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter the number of elements, you will add.");
        int howMany = Integer.parseInt(drucker.nextLine());
        int[] myArray = new int[howMany];
        System.out.println("Please enter your elements in ascending order.");
        for (int i = 0; i < howMany; i++) {
            myArray[i] = Integer.parseInt(drucker.nextLine());
        }

        System.out.println("Please enter your searching number.");
        int numberToFind = Integer.parseInt(drucker.nextLine());
        int result = myBinarySearch(myArray, numberToFind);

        if (result != -1) {
            System.out.printf("The number you are looking for is on an index %d%n", result);
        } else {
            System.out.println("There is no such number");
        }


    }

    private static int myBinarySearch(int[] input, int numbToFind) {
        int down = 0;
        int up = input.length - 1;
        while (up >= down) {
            int middle = (down + up) / 2;
            if (numbToFind == input[middle]) {
                return middle;
            } else if (numbToFind < input[middle]) {
                up = middle - 1;
            } else if (numbToFind > input[middle]) {
                down = middle + 1;
            }
        }
        return -1;
    }

}
