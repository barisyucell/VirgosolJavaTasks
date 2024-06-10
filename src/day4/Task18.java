package day4;

import java.util.Arrays;

public class Task18 {

    public static void main(String[] args) {
        int[] numbers = {2,4,5,8};
        int numberToUpdate = 5;
        int newNumber = 6;
        System.out.println(isUpdateSuccessful(numbers,numberToUpdate,newNumber));
    }

    public static boolean isUpdateSuccessful(int[] arr, int number1, int number2) {
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number1) {
                System.out.println("Girilen dizi: " + Arrays.toString(arr));
                arr[i] = number2;
                System.out.println("Güncellenen dizi: " + Arrays.toString(arr));
                b = true;
            }
        }
        return b;
    }

}


/*
Bir dizinin belirli bir elemanını bulup güncelleyen bir metot yazın
(ipucu: metot ayrıca eleman dizide varsa ve güncelleme gerçekleşirse true, yoksa false dönsün).
*/