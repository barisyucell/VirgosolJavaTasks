package day2;

import java.util.Scanner;

public class Task5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir puan giriniz: ");
        int puan = scanner.nextInt();

        if (puan >= 90 && puan <= 100) {
            System.out.println("Not: A");
        } else if (puan >= 80 && puan <= 89) {
            System.out.println("Not: B");
        } else if (puan >= 70 && puan <= 79) {
            System.out.println("Not: C");
        } else if (puan >= 60 && puan <= 69) {
            System.out.println("Not: D");
        } else if (puan >= 0 && puan <= 59) {
            System.out.println("Not: F");
        } else {
            System.out.println("Lütfen 0-100 arası bir puan giriniz");
        }

        scanner.close();
    }
}


/*
= Açıklama =
Bir üniversite, öğrencilerin aldığı derslere göre notlarını harf notuna çeviren bir Java programı yazmanızı istemektedir.
Program her bir öğrencinin notunu okuyacak ve aşağıdaki kurallara göre harf notunu belirleyecektir:
	- 90-100: A
	- 80-89:  B
	- 70-79:  C
	- 60-69:  D
	- 0-59:   F

= Örnek Girdi =
Bir puan giriniz: 85

= Örnek Çıktı =
Not: B
*/