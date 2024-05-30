package day2;

import java.util.Scanner;

public class Task12
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ay numarası giriniz (1-12): ");
        int ayNumarasi = scanner.nextInt();

        if (ayNumarasi >= 1 && ayNumarasi <= 12) {
            switch (ayNumarasi) {
                case 6:
                    System.out.println("Yaz mevsimindesiniz.");
                    break;
                case 7:
                    System.out.println("Yaz mevsimindesiniz.");
                    break;
                case 8:
                    System.out.println("Yaz mevsimindesiniz.");
                    break;
                default:
                    System.out.println("Yaz mevsiminde değilsiniz!");
            }
        } else {
            System.out.println("Lütfen belirtilen aralıkta bir değer giriniz");
        }

        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan bir ay numarası girmesini isteyen ve bu ayın yaz mevsiminde olup olmadığını belirleyen programı "Switch-Case" kullanarak yazınız.

= Örnek Girdi =
Bir ay numarası giriniz (1-12): 7

= Örnek Çıktı =
Yaz mevsimindesiniz.
*/