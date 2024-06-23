package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.addAll(Arrays.asList("İstanbul", "Ankara", "İzmir", "Antalya", "Çanakkale"));

        for (String city : cities) {
            System.out.print(city + " ");
        }
    }

}


/*
ArrayList sınıfını kullanarak bir ArrayList oluşturun ve içine 5 farklı şehir ekleyin.
Bu şehirleri ekrana yazdırın.
*/