package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        int evenNumbersCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(i+1 + ". sayıyı giriniz = ");
            numbers.add(scanner.nextInt());
        }

        scanner.close();

        for (Integer number : numbers) {
            if (number % 2 == 0) evenNumbersCount++;
        }

        System.out.println("Girilen sayılardan " + evenNumbersCount + " tanesi ÇİFT, " + (numbers.size()-evenNumbersCount) + " tanesi TEK sayıdır!");
    }

}


/*
Bir ArrayList kullanarak kullanıcıdan alınan 10 farklı tam sayıyı saklayın.
Bu tam sayılardan kaç tanesinin çift, kaç tanesinin tek olduğunu bulan ve sonucu ekrana yazdıran bir program yazın.
*/