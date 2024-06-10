package day4;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        int[] numbers = {5, -3, 4, 9, 0, -8, 2};
        System.out.println("Büyükten küçüğe = " + Arrays.toString(fromMaxToMin(numbers)));
    }

    public static int[] fromMaxToMin(int[] arr) {
        int[] numbersFromMaxToMin = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] < arr[j])) count++;
            }
            numbersFromMaxToMin[count] = arr[i];
        }
        return numbersFromMaxToMin;
    }

}


// Bir dizinin elemanlarını büyükten küçüğe sıralayan bir metot yazın.