package day2;

public class Task9 {
    public static void main(String[] args) {
        String kelime = "abc";

        char ilkHarf = kelime.charAt(0);
        int ilkHarfASCII = ilkHarf;

        char ikinciHarf = kelime.charAt(1);
        int ikinciHarfASCII = ikinciHarf;

        char ucuncuHarf = kelime.charAt(2);
        int ucuncuHarfASCII = ucuncuHarf;

        System.out.println("Karakter: " + ilkHarf + ", ASCII Değeri: " + ilkHarfASCII);
        System.out.println("Karakter: " + ikinciHarf + ", ASCII Değeri: " + ikinciHarfASCII);
        System.out.println("Karakter: " + ucuncuHarf + ", ASCII Değeri: " + ucuncuHarfASCII);
    }
}


/*
= Açıklama =
"abc" metinindeki ASCII değerlerini ekrana yazdıran programı yazınız.

= Örnek Çıktı =
Karakter: a, ASCII Değeri: 97
Karakter: b, ASCII Değeri: 98
Karakter: c, ASCII Değeri: 99
*/