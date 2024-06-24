package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task21 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.addAll(Arrays.asList("İstanbul", "İzmir", "Ankara", "Antalya", "Çanakkale", "istanbul", "izmir"));

        cities.removeIf(p -> p.startsWith("İ") || p.startsWith("i"));
        System.out.println(cities);
    }

}


/*
ArrayList<String> cities = new ArrayList<>();
cities.addAll(Arrays.asList("İstanbul", "İzmir", "Ankara", "Antalya", "Çanakkale"));

olan bir "cities" listesinden "İ" harfi ile başlayan illeri çıkarmak (silmek) istiyorum.
Bu listenin dinamik olduğunu ve hangi ilin hangi indekste olduğunu bilmediğimizi kabul ederek çözelim.
*/