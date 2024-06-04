package day3;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir alt limit değeri giriniz = ");
        int altLimit = scanner.nextInt();

        System.out.print("Lütfen bir üst limit değeri giriniz = ");
        int ustLimit = scanner.nextInt();

        int orijinalSayi, basamakSayisi, basamak, toplam;

        for (int sayi = altLimit; sayi <= ustLimit; sayi++) {
            orijinalSayi = sayi;
            basamakSayisi = String.valueOf(sayi).length();
            toplam = 0;

            while (sayi != 0) {
                basamak = sayi % 10;
                toplam += Math.pow(basamak, basamakSayisi);
                sayi /= 10;
            }

            sayi = orijinalSayi;

            if (sayi == toplam) {
                System.out.print(sayi + " ");
            }
        }

        scanner.close();
    }

}


/*
Bir sayının Armstrong sayısı olup olmadığını kontrol eden ve belirli bir aralıktaki tüm Armstrong sayılarını bulan bir Java programı yazın.
Armstrong sayısı; n basamaklı bir sayının, basamaklarının n’inci kuvvetleri toplamına eşit olduğu sayıdır (örneğin 153 = 1³ + 5³ + 3³).
*/