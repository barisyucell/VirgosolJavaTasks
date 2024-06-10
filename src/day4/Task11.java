package day4;

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.toString(copyArrayElements(numbers)));
    }

    public static int[] copyArrayElements(int[] arr) {
        int[] duplicateArr = new int[arr.length * 2];
        for (int i = 0, k = 0; i < arr.length; i++, k+=2) {
            duplicateArr[k] = arr[i];
            duplicateArr[k+1] = arr[i];
        }
        return duplicateArr;
    }

}


// Bir dizinin elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metot yazın.