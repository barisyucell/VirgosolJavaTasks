package day1;

public class Task9 {
    public static void main(String[] args) {
        double aliToplamTutar = 123.456;
        double veliToplamTutar = 503.798;

        int aliToplamTutarInt = (int) aliToplamTutar;
        int veliToplamTutarInt = (int) veliToplamTutar;

        System.out.println(aliToplamTutarInt + veliToplamTutarInt);
    }
}


/*
= Açıklama =
Ali ve Veli marketten alışveriş yaparken aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.
Ali'nin aldığı ürünlerin toplam tutarı 123.456 TL ve Veli'nin aldığı ürünlerin toplam tutarı da 503.798 TL.
Ancak Ali ile Veli ondalık kısımları görmek istemiyor ve tutarları tam sayı olarak görmek istiyor.
Son olarak Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.

Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız.
*/