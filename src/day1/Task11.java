package day1;

public class Task11 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 12;

        boolean ortancaDegermi = ((a < b) && (b < c)) || ((c < b) && (b < a));

        System.out.println("a, b ve c'nin toplamı 25'e eşit mi? " + (a + b + c == 25));
        System.out.println("a ve b'nin toplamı c'den büyük mü? " + ((a + b) > c));
        System.out.println("a'nın karesi b'den küçük mü? " + ((a * a) < b));
        System.out.println("b, a ve c arasında ortanca değer mi? " + ortancaDegermi);
        System.out.println("c, a ve b'nin toplamından küçük mü? " + (c < (a + b)));
    }
}


/*
= Açıklama =
Aşağıdaki Java programında mantıksal ve ilişkisel operatörleri kullanarak belirli koşulları kontrol ediniz ve sonuçları ekrana yazdırınız.
Programda "if", "else", "for", "while" gibi kontrol yapıları KULLANMADAN ifadelerin doğruluğunu ve mantıksal işlemleri gerçekleştiriniz.

Görevler:
1. Üç adet tam sayı belirleyiniz: "a = 5", "b = 8", "c = 12".
2. Aşağıdaki ifadelerin doğruluğunu kontrol ediniz ve sonuçları ekrana yazdırınız:
    - "a", "b" ve "c"nin toplamı 25'e eşit mi?
    - "a" ve "b"nin toplamı "c"den büyük mü?
    - "a"nın karesi "b"den küçük mü?
    - "b", "a" ve "c" arasında ortanca değer mi?
    - "c", "a" ve "b"nin toplamından küçük mü?

3. Mantıksal ve ilişkisel operatörleri kullanarak ifadelerin doğruluğunu kontrol ediniz ve sonuçları ekrana yazdırınız.

= İstenen Çıktı=
a, b ve c'nin toplamı 25'e eşit mi? true
a ve b'nin toplamı c'den büyük mü? true
a'nın karesi b'den küçük mü? true
b, a ve c arasında ortanca değer mi? true
c, a ve b'nin toplamından küçük mü? false

Bu işlevi yerine getiren Java kodunu yazınız.
*/