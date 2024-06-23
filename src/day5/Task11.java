package day5;

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        int[] numbers = {5, -3, 4, 9, 0, -8, 2};
        System.out.println("Dizideki elemanların küçükten büyüğe sıralanışı: " + Arrays.toString(sortArrayAscending(numbers)));
    }

    public static int[] sortArrayAscending(int[] arr) {
        int[] ascendingArr = new int[arr.length];
        int count;

        for (int i = 0; i < arr.length; i++) {
            count = -1;
            for (int j = 0; j < arr.length; j++) {
                if (!(arr[i] < arr[j])) count++;
            }
            ascendingArr[count] = arr[i];
        }

        return ascendingArr;

        /*
        = 2. YOL =
        Arrays.sort(arr);
        return arr;
        */
    }

}


/*
"int" tipinde bir dizi oluşturun ve bu diziyi sıralayan bir metot yazın.
Bu metodu çağırarak sonucu ekrana yazdırın.
*/