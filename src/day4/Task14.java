package day4;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(findOddNumbers(numbers)));
    }

    public static int[] findOddNumbers(int[] arr) {
        int[] tempOddNumbers = new int[arr.length];
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                tempOddNumbers[count] = arr[i];
            }
        }
        int[] oddNumbers = new int[count+1];
        for (int j = 0; j < oddNumbers.length; j++) oddNumbers[j] = tempOddNumbers[j];
        return oddNumbers;
    }

}


// Bir dizideki tek sayıları bulan ve bunları başka bir diziye ekleyen bir metot yazın.