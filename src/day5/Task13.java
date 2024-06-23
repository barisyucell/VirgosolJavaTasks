package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task13 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(51, 145, 264, 389, 490));
        findSumOfDigitsOfEachNumber(numbers);
    }

    public static void findSumOfDigitsOfEachNumber(ArrayList<Integer> arrayList) {
        int sumOfDigits, number;

        for (int i = 0; i < arrayList.size(); i++) {
            number = arrayList.get(i);
            sumOfDigits = 0;

            while (number != 0) {
                sumOfDigits += number % 10;
                number /= 10;
            }
            System.out.println(arrayList.get(i) + " sayısının rakamları toplamı = " + sumOfDigits);
        }
    }

}


/*
Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin.
Bu Integer değerlerin her birinin rakamlarının toplamını hesaplayın ve bu toplamları ekrana yazdırın.
Örneğin; listede 123 varsa rakamları toplamı 6 olmalıdır.
*/