package Task17_BinarySearch;

import java.util.Scanner;

public class V2_BinarySearchRecursive_G {
    public static void main(String[] args) {
        Scanner drucker = new Scanner(System.in);
        System.out.println("Please enter the number of elements, you will add.");
        int count = Integer.parseInt(drucker.nextLine());
        int[] inputArray = new int[count];
        System.out.println("Please enter all your elements in ascending order.");
        for (int i = 0; i < count; i++) {
            inputArray[i] = Integer.parseInt(drucker.nextLine());
        }

        System.out.println("Please enter your searching number!");
        int numberToFind = Integer.parseInt(drucker.nextLine());
        int left = 0;
        int right = inputArray.length - 1;
        int result = myBinarySearchRecursive(inputArray, numberToFind, left, right);

        if (result != -1) {
            System.out.printf("The number you are looking for is on an index %d%n", result);
        } else {
            System.out.println("There is no such number");
        }


    }

    private static int myBinarySearchRecursive(int[] input, int numbToFind, int start, int end) {


        if (end >= start) {
            int middleIndex = (start+end)/2;
            if (input[middleIndex] == numbToFind) {
                return middleIndex;
            }
            if (numbToFind < input[middleIndex]) {
                end = middleIndex - 1;
                return myBinarySearchRecursive(input, numbToFind, start, end);
            }
            if (numbToFind > input[middleIndex]) {
                start = middleIndex + 1;
                return myBinarySearchRecursive(input, numbToFind, start, end);
            }
        }
        return -1;
    }
}
