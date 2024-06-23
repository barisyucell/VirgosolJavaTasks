package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 8, 11, 16));
        int sum = 0;

        for (Integer number : numbers) {
            System.out.println(number);
            sum += number;
        }

        System.out.println("Toplam = " + sum);
    }

}


/*
Bir ArrayList oluşturun ve içine Integer Wrapper sınıfı kullanarak birkaç sayı ekleyin.
Bu sayıları ekrana yazdırın ve ardından toplamını hesaplayarak ekrana yazdırın.
*/