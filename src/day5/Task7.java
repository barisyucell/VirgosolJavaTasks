package day5;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArray(numbers)));
    }

    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] reversedArray = new int[length];

        for (int i = length-1; i >= 0; i--) {
            reversedArray[length-i-1] = arr[i];
        }
        return reversedArray;
    }

}


/*
"int" tipinde bir dizi oluşturun ve bu diziyi tersine çeviren bir metot yazın.
Bu metodu çağırarak sonucu ekrana yazdırın.
*/