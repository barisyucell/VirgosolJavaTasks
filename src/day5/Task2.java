package day5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[100];
        int sum = 0, count = 0;
        double average;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);  // Her iterasyonda [0-100] aralığında rastgele sayı üretiliyor ve "numbers" dizisine aktarılıyor.
            sum += numbers[i];
        }

        average = (double) sum / numbers.length;

        for (int number : numbers) {
            if (number > average) {
                count++;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(numbers));
        System.out.println("Ortalama: " + average);
        System.out.println("Ortalamadan büyük olan sayı adedi: " + count);
    }

}


/*
100 adet rastgele sayının bulunduğu bir dizi oluşturun.
Bu sayıların ortalamasını hesaplayın ve ortalamadan büyük olan sayıların kaç tane olduğunu bulun.
*/