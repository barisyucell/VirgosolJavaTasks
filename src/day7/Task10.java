package day7;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bölünen sayıyı giriniz = ");
        int number1 = scanner.nextInt();
        System.out.print("Bölen sayıyı giriniz = ");
        int number2 = scanner.nextInt();
        scanner.close();

        try {
            if (number2 == 0) throw new ArithmeticException();
            System.out.println("Bölme işleminin sonucu = " + ((double)number1/number2));
        } catch (ArithmeticException e) {
            System.out.println("Bölen sayı 0 olamaz!");
        }
    }

}


/*
= Bölme İşlemi =
- Kullanıcıdan alınan iki sayıyı birbirine bölen bir program yazın.
- Bölme işlemi sırasında ortaya çıkabilecek ArithmeticException'ı try-catch bloğu içinde ele alarak uygun bir mesajla kullanıcıya hatayı bildirin.

= AÇIKLAMA =
- Java'da "double" tipinde bir sayıyı 0'a böldüğümüzde "ArithmeticException" fırlatılmıyor!
  Bu durumda "Sayı / 0" işleminden sonuç "Infinity" ve "0/0" işleminden de sonuç "NaN (Not a Number)" olarak geliyor.
  Bu durumu halletmek için try bloğundaki if koşulunu ekleyerek kullanıcı bölen sayıyı 0 girdiğinde programın catch bloğuna geçmesini sağladım.
  İlgili if satırını yoruma alıp programı çalıştırarak farkı görebilirsiniz.
*/