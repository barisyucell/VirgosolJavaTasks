package day2;

import java.util.Scanner;

public class Task2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        /*
        Eğer burada "scanner.next()" kullanırsak, bu kod boşluk karakterinden sonrasını okumadığı için alttaki if bloğunda "boşluk içeriyor mu"
        kontrolünü yapsak bile false verir ve biz bu kontrolü yapamamış oluruz.
        Bundan dolayı böyle bir kontrol yapacaksak, sadece tek bir kelime istesek bile burada "scanner.next()" yerine "scanner.nextLine()" kullanmalıyız.
        */

        if (kelime.contains(" "))
        {
            System.out.println("Lütfen tek bir kelime giriniz ve arada boşluk bırakmayınız");
        } else {
            System.out.println("Kelimenin uzunluğu: " + kelime.length());
        }

        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan bir kelime girmesini isteyen ve kelimenin uzunluğunu ekrana yazdıran programı yazınız.

= Örnek Girdi =
Bir kelime giriniz: merhaba

= Örnek Çıktı =
Kelimenin uzunluğu: 7
*/