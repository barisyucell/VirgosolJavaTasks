package day2;

import java.util.Scanner;

public class Task10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci cümleyi giriniz: ");
        String cumle1 = scanner.nextLine();
        int cumle1Uzunlugu = cumle1.length();

        System.out.print("İkinci cümleyi giriniz: " );
        String cumle2 = scanner.nextLine();
        int cumle2Uzunlugu = cumle2.length();

        if (cumle1Uzunlugu > cumle2Uzunlugu) {
            System.out.println("Uzun olan cümle: " + cumle1);
        } else {
            System.out.println("Uzun olan cümle: " + cumle2);
        }

        scanner.close();
    }
}


/*
= Açıklama =
Girilen iki cümleden uzun olanı bulan bir program yazın.

= Örnek Girdi =
Birinci cümleyi giriniz: Merhaba Dünya
İkinci cümleyi giriniz: Java programlama dili

= Örnek Çıktı =
Uzun olan cümle: Java programlama dili
*/