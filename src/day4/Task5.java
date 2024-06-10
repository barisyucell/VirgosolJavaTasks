package day4;

public class Task5 {

    public static void main(String[] args) {
        int[] numbers = {7, 3, -5, 10, 0, -1};
        System.out.println("Dizideki elemanların toplamı = " + sumOfNumbers(numbers));
    }

    public static int sumOfNumbers(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

}


// Bir diziyi parametre olarak alan ve dizideki elemanların toplamını bulan bir metot yazın.