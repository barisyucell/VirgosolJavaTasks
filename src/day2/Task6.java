package day2;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        if (cumle.length() < 50) {
            System.out.println("Kısa bir cümle");
        } else {
            System.out.println("Kısa bir cümle değil");
        }

        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan bir cümle girmesini isteyen ve eğer cümlenin uzunluğu 50'den küçükse "Kısa bir cümle" mesajını yazdıran programı yazınız.

= Örnek Girdi =
Bir cümle giriniz: Merhaba, nasılsınız?

= Örnek Çıktı =
Kısa bir cümle
*/