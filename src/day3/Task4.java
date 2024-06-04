package day3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        boolean asallikDurumu = true;

        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asallikDurumu = false;
                    break;
                }
            }
            System.out.println(sayi + " sayısı asal mı? => " + asallikDurumu);
        } else {
            System.out.println("Lütfen 1'den büyük pozitif bir tam sayı giriniz!");
        }

        scanner.close();
    }

}


// Bir sayının asal olup olmadığını "for" döngüsü kullanarak kontrol eden bir Java programı yazın.