package day2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kelimeyi giriniz: ");
        String kelime1 = scanner.next();

        System.out.print("İkinci kelimeyi giriniz: ");
        String kelime2 = scanner.next();

        if (kelime1.equalsIgnoreCase(kelime2)) {
            System.out.println("Kelimeler eşit.");
        } else {
            System.out.println("Kelimeler eşit değil.");
        }

        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan iki kelime girmesini isteyen ve bu kelimelerin eşit olup olmadığını kontrol eden programı yazınız.

= Örnek Girdi =
Birinci kelimeyi giriniz: Merhaba
İkinci kelimeyi giriniz: Merhaba

= Örnek Çıktı =
Kelimeler eşit.
*/