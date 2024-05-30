package day2;

import java.util.Scanner;

public class Task13
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        System.out.print("Aranacak karakter: ");
        char karakter = scanner.nextLine().charAt(0);

        // Girdiğimiz metinde aramak istediğimiz karakterden birden fazla varsa hepsini bulmak için:
        for (int i = 0; i <= (metin.length() - 1); i++) {
            if (metin.charAt(i) == karakter) {
                System.out.println("Karakter " + karakter + ", " + i + ". pozisyonda bulunuyor.");
            }
        }

        //--------------------------------------------------------------------------------------------------------------

        /*
        // Girdiğimiz metinde aramak istediğimiz karakterden birden fazla varsa sadece ilkini bulmak için:

        String karakterString = String.valueOf(karakter);

        if (metin.contains(karakterString)) {
            System.out.println("Karakter " + karakter + ", " + metin.indexOf(karakter) + ". pozisyonda bulunuyor.");
        } else {
            System.out.println("Girdiğiniz metinde böyle bir karakter yok");
        }
        */

        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan bir metin ve bir karakter girmesini isteyen ve metindeki karakterin pozisyonunu bulan bir program yazınız.

= Örnek Girdi =
Bir metin giriniz: Merhaba Dünya
Aranacak karakter: a

= Örnek Çıktı =
Karakter 'a' 4. pozisyonda bulunuyor.
*/