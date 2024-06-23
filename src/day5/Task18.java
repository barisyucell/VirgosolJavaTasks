package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task18 {

    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>(Arrays.asList("defter", "kitap", "sandalye", "masa"));
        ArrayList<Integer> lengthsOfObjects = new ArrayList<>();

        for (String object : objects) {
            lengthsOfObjects.add(object.length());
        }

        Collections.sort(lengthsOfObjects);
        System.out.println(lengthsOfObjects);

        for (String object : objects) {
            if (object.length() == lengthsOfObjects.get(0)) {
                System.out.println("En kısa kelime: " + object);
            } else if (object.length() == lengthsOfObjects.get(lengthsOfObjects.size()-1)) {
                System.out.println("En uzun kelime: " + object);
            }
        }
    }

}


/*
Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
Her kelimenin uzunluğunu tutan bir ArrayList daha oluşturun ve bu uzunlukları sıralı olarak ekrana yazdırın.
Son olarak en uzun ve en kısa kelimeleri bularak ekrana yazdırın.
*/