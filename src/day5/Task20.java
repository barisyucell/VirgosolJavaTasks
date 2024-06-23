package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task20 {

    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(5.2, 3.7, 10.9, 7.1, 8.6));

        double sum = 0, average;

        for (Double number : numbers) {
            sum += number;
        }

        average = sum / numbers.size();

        System.out.println("En büyük değer = " + Collections.max(numbers));
        System.out.println("En küçük değer = " + Collections.min(numbers));
        System.out.println("Ortalama = " + average);

        for (Double number : numbers) {
            if (number > average) {
                System.out.println(number + " ---> " + "ortalamadan büyük");
            } else if (number < average) {
                System.out.println(number + " ---> " + "ortalamadan küçük");
            } else {
                System.out.println(number + " ---> " + "ortalamaya eşit");
            }
        }
    }

}


/*
Bir ArrayList oluşturun ve içine birkaç Double değer ekleyin.
Bu değerlerden en büyük ve en küçük olanını bulun.
Ardından listedeki tüm elemanların ortalamasını hesaplayın ve bu ortalamayı ekrana yazdırın.
Son olarak listedeki her elemanı ortalamadan büyük mü küçük mü diye kontrol edin ve sonuçları ayrı ayrı ekrana yazdırın.
*/