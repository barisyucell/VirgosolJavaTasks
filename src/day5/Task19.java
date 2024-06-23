package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40));

        System.out.print("Lütfen bir sayı giriniz = ");
        int enteredNumber = scanner.nextInt();

        scanner.close();

        System.out.print(enteredNumber + " ile toplamı 100 olan sayı çiftleri: ");
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) + enteredNumber == 100) {
                    System.out.print(numbers.get(i) + "-" + numbers.get(j) + "  ");
                }
            }
        }
    }

}


/*
Bir ArrayList oluşturun ve içine 20 rastgele tam sayı ekleyin.
Kullanıcıdan bir sayı alın ve bu sayının listedeki elemanlarla toplamının 100 olduğu tüm çiftleri bulun ve ekrana yazdırın.
*/