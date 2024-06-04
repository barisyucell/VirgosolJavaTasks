package day3;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime = scanner.next();

        String kelimeninTersi = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {
            kelimeninTersi += kelime.charAt(i);
        }

        System.out.println("Kelimenin tersi: " + kelimeninTersi);

        if (kelime.equalsIgnoreCase(kelimeninTersi)) {
            System.out.println(kelime + " ve " + kelimeninTersi + " EŞİT");
        } else {
            System.out.println(kelime + " ve " + kelimeninTersi + " EŞİT DEĞİL");
        }

        scanner.close();
    }

}


/*
Verilen bir String kelimenin palindromik olup olmadığını bulan bir Java programı yazın.
Palindromik, ileri ve geri okunduğunda aynı olan kelimedir (örnek: "kayak").
*/