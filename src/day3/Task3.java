package day3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int ilkSayi = 0, ikinciSayi = 1;

        while (ilkSayi <= sayi) {
            System.out.print(ilkSayi + " ");
            int sonrakiSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }

        scanner.close();
    }

}


// Kullanıcıdan alınan bir sayıya kadar Fibonacci serisini "while" döngüsü kullanarak yazdıran bir Java programı yazın.