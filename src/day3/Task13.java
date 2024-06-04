package day3;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir alt limit değeri giriniz = ");
        int altLimit = scanner.nextInt();

        System.out.print("Lütfen bir üst limit değeri giriniz = ");
        int ustLimit = scanner.nextInt();

        int sayi, sayininTersi, orijinalSayi;
        int toplam = 0;

        for (sayi = altLimit; sayi <= ustLimit; sayi++) {
            orijinalSayi = sayi;
            sayininTersi = 0;

            while (sayi != 0) {
                sayininTersi = (sayininTersi * 10) + (sayi % 10);
                sayi /= 10;
            }

            sayi = orijinalSayi;

            if (sayininTersi == orijinalSayi) {
                System.out.println(sayi);
                toplam += sayi;
            }
        }

        System.out.println("Toplam = " + toplam);

        scanner.close();
    }

}


/*
Bir aralık belirleyerek (örneğin 1 ile 1000 arası) bu aralıktaki palindromik sayıların toplamını hesaplayan bir Java programı yazın.
Palindromik sayılar, aynı şekilde okunan sayılardır (örneğin 121, 131).
*/