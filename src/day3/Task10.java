package day3;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz = ");
        int sayi = scanner.nextInt();

        int rakamlariToplami = 0;

        for (int i = sayi; i != 0; i /= 10) { rakamlariToplami += (i % 10); }

        System.out.println("Sayının rakamları toplamı = " + rakamlariToplami);

        scanner.close();
    }

}


// "For" döngüsü kullanarak bir sayının basamaklarını toplayan bir Java programı yazın.