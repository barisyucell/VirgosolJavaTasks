package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Mevcut dizi: " + Arrays.toString(numbers));
        updateArray(numbers);
    }

    public static void updateArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin yeni elemanlarını giriniz...");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1 + ". elemanı giriniz = ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Güncellenen dizi: " + Arrays.toString(arr));
    }

}


/*
Bir sınıf oluşturun ve bu sınıfta bir dizi tanımlayın.
Dizi elemanlarını bir metot içinde güncelleyin ve ekrana yazdırın.
*/