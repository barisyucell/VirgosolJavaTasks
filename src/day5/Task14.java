package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, -4, 7, 0, 21, -8));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Integer number : numbers) {
            if (number < min) min = number;
        }

        for (Integer number : numbers) {
            if (number > max) max = number;
        }

        System.out.println("ArrayList içerisindeki en küçük sayı = " + min);
        System.out.println("ArrayList içerisindeki en büyük sayı = " + max);

        /*
        = 2. YOL =
        System.out.println("ArrayList içerisindeki en küçük sayı = " + Collections.min(numbers));
        System.out.println("ArrayList içerisindeki en büyük sayı = " + Collections.max(numbers));
        */
    }

}


/*
Bir ArrayList oluşturun ve içine birkaç sayı ekleyin.
Bu sayılar arasından en küçük ve en büyük sayıları bulun ve sonucu ekrana yazdırın.
*/