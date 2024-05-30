package day2;

import java.util.Scanner;

public class Task18
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir gezegen adı giriniz: ");
        String gezegenAdi = scanner.next();

        switch (gezegenAdi) {
            case "Merkür":
                System.out.println("İç gezegen");
                break;
            case "Venüs":
                System.out.println("İç gezegen");
                break;
            case "Dünya":
                System.out.println("İç gezegen");
                break;
            case "Mars":
                System.out.println("İç gezegen");
                break;
            case "Jüpiter":
                System.out.println("Dış gezegen");
                break;
            case "Satürn":
                System.out.println("Dış gezegen");
                break;
            case "Uranüs":
                System.out.println("Dış gezegen");
                break;
            case "Neptün":
                System.out.println("Dış gezegen");
                break;
            default:
                System.out.println("Yanlış bir gezegen adı girdiniz!");
        }

        scanner.close();
    }
}


/*
= Açıklama =
Bir Astronom, gezegenleri sınıflandırmak için bir program geliştirmek istiyor.
Kullanıcıdan girilen gezegen adıyla gezegenin iç gezegen mi yoksa dış gezegen mi olduğunu belirlemesi gerekiyor.
Astronomun bu programı yazmasına yardımcı olun.

= Not-1 =
İÇ GEZEGENLER: Merkür, Venüs, Dünya ve Mars.
DIŞ GEZEGENLER: Jüpiter, Satürn, Uranüs ve Neptün.

= Not-2 =
Switch-Case kullanarak yazınız.

= Örnek Girdi =
Bir gezegen adı giriniz: Dünya

= Örnek Çıktı =
İç gezegen
*/