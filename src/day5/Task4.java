package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {3, 7, 10, 15, 20};
        int count = 0;

        System.out.print("Bir sayı giriniz = ");
        int enteredNumber = scanner.nextInt();

        scanner.close();

        for (int number : numbers) {
            if (number == enteredNumber) {
                System.out.println(enteredNumber + " sayısı, " + Arrays.toString(numbers) + " dizisinde mevcut!");
                count = 1;
                break;
            }
        }

        if (count == 0) {
            System.out.println(enteredNumber + " sayısı, " + Arrays.toString(numbers) + " dizisinde mevcut değil!");
        }
    }

}


/*
"int" tipinde bir dizi oluşturun ve kullanıcıdan bir sayı alın.
Bu sayının dizide olup olmadığını kontrol edin ve sonucu ekrana yazdırın.
*/