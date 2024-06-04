package day3;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen String bir ifade giriniz: ");
        String str = scanner.nextLine();

        String tekrarlananKarakterler = "";

        for (int i = 0; i < str.length(); i++) {
            char karakter = str.charAt(i);
            if (tekrarlananKarakterler.indexOf(karakter) != -1) { continue; }

            for (int j = i + 1; j < str.length(); j++) {
                if (karakter == str.charAt(j)) {
                    tekrarlananKarakterler += karakter;
                    break;
                }
            }
        }

        System.out.println(tekrarlananKarakterler);

        scanner.close();
    }

}


// "For" döngüsü kullanarak bir String ifadede tekrar eden karakterleri bulan bir Java programı yazın.