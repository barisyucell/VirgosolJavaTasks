package day4;

public class Task15 {

    public static void main(String[] args) {
        int[] numbers = {5, -3, 4, 9, 0, -8, 2};
        System.out.println("Dizideki elemanların toplamı = " + sumOfElements(numbers));
    }

    public static int sumOfElements(int[] arr) {
        int sum = 0;
        for (int each : arr) {
            sum += each;
        }
        return sum;
    }

}


// Bir dizideki elemanları toplayan ve sonucu döndüren bir metot yazın.