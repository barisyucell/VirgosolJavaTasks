package day4;

import java.util.Arrays;

public class Task16 {

    public static void main(String[] args) {
        int[] numbers1 = {0, 3, 7, 8};
        int[] numbers2 = {5, 9, 13, -4, 0, 6};
        System.out.println(Arrays.toString(concatenateTwoArrays(numbers1, numbers2)));
    }

    public static int[] concatenateTwoArrays (int[] arr1, int[] arr2) {
        int[] concatOfTwoArrays = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            concatOfTwoArrays[i] = arr1[i];
        }

        for (int j = arr1.length; j < concatOfTwoArrays.length; j++) {
            concatOfTwoArrays[j] = arr2[j - arr1.length];
        }
        return concatOfTwoArrays;
    }

}


/*
İki diziyi birleştiren ve yeni bir dizi oluşturan bir metot yazın
(ipucu: metot iki adet parametre (int[] dizi1, int[] dizi2) alıyor).
*/