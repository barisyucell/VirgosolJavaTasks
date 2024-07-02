package day7;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tam sayı giriniz = ");
        int number = scanner.nextInt();
        scanner.close();

        if (number == 0) {
            throw new Exception("Yanlış sayı girdiniz!");
        } else if (number > 0) {
            System.out.println("İşlem başarılı!");
        } else {
            System.out.println("Negatif bir sayı girdiniz!");
        }
    }

}


/*
= "throw new Exception()" =
- Kullanıcıdan pozitif tam sayı girmesini isteyin (Scanner).
- Kullanıcı sıfır değerini girmişse "yanlış sayı girdiniz" exception mesajı fırlatan kodu yazın.
*/