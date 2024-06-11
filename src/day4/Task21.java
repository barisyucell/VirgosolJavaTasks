package day4;

import java.util.Arrays;

public class Task21 {

    public static void main(String[] args) {
        String str = "sdsff3h5hhh2h6h23";
        System.out.println("String ifade: " + str);
        System.out.println("String ifadedeki rakamlar: " + Arrays.toString(getNumbersFromParameter(str)));
        System.out.println();
        int number = 2343546;
        System.out.println("Sayı: " + number);
        System.out.println("Sayıdaki rakamlar: " + Arrays.toString(getNumbersFromParameter(number)));
    }

    public static int[] getNumbersFromParameter(String str) {
        int length = str.length();
        int count = 0;
        int[] tempIntArray = new int[length];
        char[] charArray = new char[length];
        for (int i = 0, k = 0; i < length; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                charArray[k] = str.charAt(i);
                tempIntArray[k] = Integer.parseInt(String.valueOf(charArray[k]));
                k++;
                count++;
            }
        }
        int[] intArray = new int[count];
        for (int i = 0; i < count; i++) intArray[i] = tempIntArray[i];
        return intArray;
    }

    public static int[] getNumbersFromParameter(int number) {
        String numberToStr = String.valueOf(number);
        int length = numberToStr.length();
        int[] intArray = new int[length];
        String[] tempStrArray = new String[length];
        for (int i = 0; i < length; i++) {
            tempStrArray[i] = String.valueOf(numberToStr.charAt(i));
            intArray[i] = Integer.parseInt(tempStrArray[i]);
        }
        return intArray;
    }

}


/*
"String" veya "int" bir değişkeni parametre olarak alan metotlar (overloading) yazalım.
Metot, aldığı değişkenlerin "number" olan her bir karakterini bir diziye atsın ve geriye bir "int[] dizi" dönsün.

Örnek olarak;
String str = "sdsff3h5hhh2h6h23" ise return olan dizi ---> [3,5,2,6,2,3]
int number = 2343546 ----->  [2,3,4,3,5,4,6]
*/