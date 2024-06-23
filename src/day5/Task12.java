package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("araba", "defter", "kayak", "balık"));
        char letterToSearch = 'a';
        findNumberOfSpecificLetterInEachWord(words, letterToSearch);
    }

    public static void findNumberOfSpecificLetterInEachWord(ArrayList<String> arrayList, char ch) {
        int count, length;

        for (int i = 0; i < arrayList.size(); i++) {
            count = 0;
            length = arrayList.get(i).length();

            for (int j = 0; j < length; j++) {
                if (arrayList.get(i).charAt(j) == ch) count++;
            }

            System.out.println(arrayList.get(i) + " kelimesindeki " + ch + " harfi sayısı = " + count);
        }
    }

}


/*
Bir ArrayList oluşturun ve içine birkaç kelime ekleyin.
Her kelimenin içindeki belirli bir harfin sayısını bulan bir metot yazın ve sonucu ekrana yazdırın.
*/