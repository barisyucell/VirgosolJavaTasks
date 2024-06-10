package day4;

public class Task4 {

    public static void main(String[] args) {
        int[] numbers = {1, -4, 7, 0, 21, -8};
        System.out.println("Dizideki en küçük eleman = " + smallestNumber(numbers));
    }

    public static int smallestNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int number : arr) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

}


// Bir diziyi parametre olarak alan ve dizideki en küçük elemanı bulan bir metot yazın.