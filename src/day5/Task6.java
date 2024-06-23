package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 5, 8));

        System.out.println("ArrayList: " + numbers);

        numbers.set(2, 6);

        System.out.println("Güncellenen ArrayList: " + numbers);
    }

}


/*
Bir ArrayList oluşturun ve içine birkaç sayı ekleyin.
Belirli bir indekste bulunan sayıyı başka bir sayıyla değiştirin ve sonucu ekrana yazdırın.
*/