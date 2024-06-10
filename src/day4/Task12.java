package day4;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
        String[] days = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"};
        int minIndex = 1;
        int maxIndex = 3;
        System.out.println(Arrays.toString(copyElementsOfSpecifiedRange(days,minIndex,maxIndex)));
    }

    public static String[] copyElementsOfSpecifiedRange(String[] arr, int number1, int number2) {
        String[] newArr = new String[arr.length + number2-number1+1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i >= number1 && i <= number2) {
                newArr[i] = arr[i];
                newArr[arr.length+k] = arr[i];
                k++;
            }
            else newArr[i] = arr[i];
        }
        return newArr;
    }

}


// Bir dizinin belirli bir aralıktaki elemanlarını kopyalayan ve yeni bir dizi oluşturan bir metot yazın.