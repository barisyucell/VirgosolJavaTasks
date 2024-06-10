package day4;

import java.util.Arrays;

public class Task13 {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(findEvenNumbers(numbers)));
    }

    public static int[] findEvenNumbers(int[] arr) {
        int[] tempEvenNumbers = new int[arr.length];
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                tempEvenNumbers[count] = arr[i];
            }
        }
        int[] evenNumbers = new int[count+1];
        for (int j = 0; j < evenNumbers.length; j++) evenNumbers[j] = tempEvenNumbers[j];
        return evenNumbers;
    }

}


// Bir dizideki çift sayıları bulan ve bunları başka bir diziye ekleyen bir metot yazın.