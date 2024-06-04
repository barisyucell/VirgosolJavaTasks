package day3;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz = ");
        int sayi = scanner.nextInt();

        int sayac = 0;
        boolean carpanAsalmi = true;

        System.out.print(sayi + " sayısının asal çarpanları = ");

        for (int i = 2; i <= sayi; i++) {

            if (sayi % i == 0) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        carpanAsalmi = false;
                        break;
                    }
                }

                if (carpanAsalmi) {
                    System.out.print(i + " ");
                    sayac++;
                }
            }

            carpanAsalmi = true;
        }

        System.out.println("\n" + "Asal çarpan sayısı = " + sayac);

        scanner.close();
    }

}


/*
Bir sayının asal çarpanlarını bulan bir Java programı yazın.
Kullanıcının girdiği bir sayının asal çarpanlarını ve bu çarpanların sayısını ekrana yazdırın.
*/