package day2;

import java.util.Scanner;

public class Task11
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();
        String kucukHarfCumle = cumle.toLowerCase();

        System.out.print("Kontrol edilecek kelime: ");
        String kelime = scanner.next();
        String kucukHarfKelime = kelime.toLowerCase();

        if (kucukHarfCumle.startsWith(kucukHarfKelime)) {
            System.out.println("Cümle " + kelime + " ile başlıyor.");
        }

        scanner.close();
    }
}


/*
= Açıklama =
Girilen bir cümlenin belirli bir kelime ile başlayıp başlamadığını kontrol eden bir program yazın.

= Örnek Girdi =
Bir cümle giriniz: Java programlama dili
Kontrol edilecek kelime: Java

= Örnek Çıktı =
Cümle "Java" ile başlıyor.
*/