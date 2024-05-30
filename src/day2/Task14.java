package day2;

import java.util.Scanner;

public class Task14
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kelimeyi giriniz: ");
        String kelime1 = scanner.next();
        String kelime1KucukHarf = kelime1.toLowerCase();

        System.out.print("İkinci kelimeyi giriniz: ");
        String kelime2 = scanner.next();
        String kelime2KucukHarf = kelime2.toLowerCase();

        if (kelime1KucukHarf.equals(kelime2KucukHarf)) {
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