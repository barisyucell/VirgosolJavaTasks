package day4;

public class Task3 {

    public static void main(String[] args) {
        int[] numbers = {1, -4, 7, 0, 21, -8};
        System.out.println("Dizideki en büyük eleman = " + greatestNumber(numbers));
    }

    public static int greatestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

}


// Bir diziyi parametre olarak alan ve dizideki en büyük elemanı bulan bir metot yazın.