package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task15 {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Mercedes", "Ford", "Opel", "Toyota"));

        cars.add(0, "Renault");
        cars.add("BMW");

        Collections.sort(cars);
        System.out.println(cars);
    }

}


/*
Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
Listenin başına ve sonuna yeni kelimeler ekleyin, ardından listeyi sıralayın ve sonucu ekrana yazdırın.
*/