package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task21 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.addAll(Arrays.asList("İstanbul", "İzmir", "Ankara", "Antalya", "Çanakkale", "istanbul", "izmir"));

        cities.removeIf(p -> p.toUpperCase().startsWith("İ"));
        System.out.println(cities);
    }

}


/*
ArrayList<String> cities = new ArrayList<>();
cities.addAll(Arrays.asList("İstanbul", "İzmir", "Ankara", "Antalya", "Çanakkale"));

olan bir "cities" listesinden "İ" harfi ile başlayan illeri silin ve kalan listeyi ekrana yazdırın
(NOT: Bu listenin dinamik olduğunu, hangi ilin hangi indekste olduğunu bilmediğimizi kabul edelim).
*/