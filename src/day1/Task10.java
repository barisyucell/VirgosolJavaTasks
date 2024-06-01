package day1;

public class Task10 {
    public static void main(String[] args) {
        boolean havaGuzel = false;
        boolean yeterliPara = true;

        boolean yemegeCikabilmeSarti = havaGuzel && yeterliPara;

        System.out.println("Yemeğe çıkabilme şartı sağlanmış mı => " + yemegeCikabilmeSarti);
    }
}


/*
= Açıklama =
Ali ve Veli bir akşam yemeği için dışarı çıkmayı planlıyorlar.
Ali'nin yemeğe çıkabilmesi için iki şart var: Hava güzel olmalı ve Ali'nin yeterli parası olmalı.
Havanın güzel olup olmadığını "boolean havaGuzel" değişkeni ile temsil ediyoruz.
Ali'nin yeterli parası olup olmadığını ise "boolean yeterliPara" değişkeni ile temsil ediyoruz.

Java'da bu iki şartın sağlanıp sağlanmadığını kontrol eden ve sonucu ekrana yazdıran bir program yazınız.
*/