package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Task19 {

    private int[] numbers = {1, 2, 3, 4, 5};

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin yeni elemanlarını giriniz...");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i+1 + ". elemanı giriniz = ");
            numbers[i] = scanner.nextInt();
        }
        this.numbers = numbers;
    }

    public static void main(String[] args) {
        Task19 obj = new Task19();
        System.out.println("Mevcut dizi: " + Arrays.toString(obj.getNumbers()));
        obj.setNumbers(obj.getNumbers());
        System.out.println("Güncellenen dizi: " + Arrays.toString(obj.getNumbers()));
    }

}


/*
Bir sınıf oluşturun ve bu sınıfta private bir dizi tanımlayın.
Bu dizi elemanlarını getter ve setter metotları ile güncelleyin ve ekrana yazdırın.
*/