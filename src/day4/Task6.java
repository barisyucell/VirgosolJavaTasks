package day4;

public class Task6 {

    public static void main(String[] args) {
        int[] numbers = {3, 14, 7, 18};
        System.out.println("Dizideki elemanların ortalaması = " + average(numbers));
    }

    public static double average (int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return (double) sum / arr.length;
    }

}


// Bir diziyi parametre olarak alan ve dizideki elemanların ortalamasını bulan bir metot yazın.