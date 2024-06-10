package day4;

import java.util.Arrays;

public class Task20 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(strToCharArr("Merhaba")));
    }

    public static char[] strToCharArr(String str) {
        char[] charArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArr[i] = str.charAt(i);
        }
        return charArr;
    }

}


/*
String bir ifadenin tüm karakterlerini bir diziye karakter karakter aktaran bir metot yazın.
Metot parametre olarak String almalı ve return olarak dizi dönmeli.
*/