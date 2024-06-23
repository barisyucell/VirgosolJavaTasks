package day5;

public class Task5 {

    public static void main(String[] args) {
        int[] numbers = {1, -4, 7, 0, 38, 21, -8};
        System.out.println("Dizideki en büyük sayı = " + findGreatestNumber(numbers));
    }

    public static int findGreatestNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int number : arr) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

}


/*
"int" tipinde bir dizi oluşturun ve bu dizideki en büyük sayıyı bulan bir metot yazın.
Bu metodu çağırarak sonucu ekrana yazdırın.
*/