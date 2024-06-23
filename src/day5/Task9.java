package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 10, 5, 13));
        int sum = 0;
        double average;

        for (Integer number : numbers) {
            sum += number;
        }

        average = (double) sum / numbers.size();
        System.out.println("Ortalama = " + average);

        System.out.print("Ortalamadan büyük sayılar = ");
        for (Integer number : numbers) {
            if (number > average) {
                System.out.print(number + " ");
            }
        }

        System.out.print("\nOrtalamadan küçük sayılar = ");
        for (Integer number : numbers) {
            if (number < average) {
                System.out.print(number + " ");
            }
        }
    }

}


/*
Bir ArrayList oluşturun ve içine birkaç Integer değer ekleyin.
Bu değerlerin ortalamasını hesaplayın.
Ardından listedeki her elemanın ortalamadan büyük mü küçük mü olduğunu kontrol edin ve ortalamanın üstündeki ve altındaki değerleri ayrı ayrı ekrana yazdırın.
*/