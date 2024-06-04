package day3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen faktöriyelini hesaplamak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi >= 0) {
            int sonuc = 1;

            for (int i = 1; i <= sayi; i++) {
                sonuc *= i;
            }

            System.out.println(sayi + "! = " + sonuc);
        }

        scanner.close();
    }

}


/*
Bir sayının faktöriyelini "for" döngüsü kullanarak hesaplayan bir Java programı yazın.
Örneğin; 5'in faktöriyeli 120'dir.
*/