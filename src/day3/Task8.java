package day3;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz = ");
        int sayi = scanner.nextInt();

        int rakamlariToplami = 0;

        while (sayi != 0) {
            rakamlariToplami += (sayi % 10);
            sayi /= 10;
        }

        System.out.println("Sayının rakamları toplamı = " + rakamlariToplami);

        scanner.close();
    }

}


// Bir sayının basamaklarını toplayan ve "while" döngüsü kullanan bir Java programı yazın.