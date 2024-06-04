package day3;

import java.util.Scanner;

public class Task16 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen String bir ifade giriniz: ");
        String str = scanner.nextLine();

        int strLength = str.length();
        int sayac;

        for (int i = 0; i < strLength; i++) {
            sayac = 0;

            for (int j = 0; j < strLength; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    sayac++;
                }
            }

            if (sayac == 1) {
                System.out.print(str.charAt(i) + " ");
            }
        }

        scanner.close();
    }

}


/*
Verilen bir string içerisindeki benzersiz karakterleri bulan ve bunları ekrana yazdıran bir Java programı yazın.
Benzersiz karakterler, string içerisinde sadece bir kez geçen karakterlerdir.
*/