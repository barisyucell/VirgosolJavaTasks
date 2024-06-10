package day4;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int[] numbers = {5, -3, 4, 9, 0, -8, 2};
        System.out.println("Küçükten büyüğe = " + Arrays.toString(fromMinToMax(numbers)));
    }

    public static int[] fromMinToMax(int[] arr) {
        int[] numbersFromMinToMax = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = -1;
            for (int j = 0; j < arr.length; j++) {
                if (!(arr[i] < arr[j])) count++;
            }
            numbersFromMinToMax[count] = arr[i];
        }
        return numbersFromMinToMax;
    }

}


// Bir dizinin elemanlarını küçükten büyüğe sıralayan bir metot yazın.