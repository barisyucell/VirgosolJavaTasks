package day2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Sayı pozitiftir");
        } else if (sayi == 0) {
            System.out.println("Sayı sıfırdır");
        } else {
            System.out.println("Sayı negatiftir");
        }

        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının pozitif, negatif veya sıfır olduğunu belirten programı yazınız.

= Örnek Girdi =
Bir tam sayı giriniz: 0

= Örnek Çıktı =
Sayı sıfırdır
*/