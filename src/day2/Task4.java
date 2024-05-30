package day2;

import java.util.Scanner;

public class Task4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        int a = scanner.nextInt();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        int b = scanner.nextInt();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0) {
            if (a == b && b == c) {
                System.out.println("Bu üçgen eşkenar üçgendir");
            } else {
                System.out.println("Bu üçgen eşkenar üçgen değildir");
            }
        } else {
            System.out.println("Lütfen geçerli değerler giriniz");
        }

        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan bir üçgenin kenar uzunluklarını girmesini isteyen ve bu üçgenin eşkenar olup olmadığını belirleyen programı yazınız.

= Örnek Girdi =
Birinci kenar uzunluğunu giriniz: 5
İkinci kenar uzunluğunu giriniz: 5
Üçüncü kenar uzunluğunu giriniz: 5

= Örnek Çıktı =
Bu üçgen eşkenar üçgendir
*/