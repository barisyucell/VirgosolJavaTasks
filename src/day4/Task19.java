package day4;

import java.util.Arrays;

public class Task19 {

    public static void main(String[] args) {
        String[] days = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"};
        String elementToDelete = "Çarşamba";
        System.out.println(Arrays.toString(deleteElement(days,elementToDelete)));
    }

    public static String[] deleteElement(String[] arr, String str) {
        String[] newArr = new String[arr.length-1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (!(arr[i].equalsIgnoreCase(str))) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }

}


/*
Bir dizide belirli bir elemanı silen ve yeni bir dizi döndüren bir metot yazın
(ipucu: yeni dizinin boyutu 1 azalmalı).
*/