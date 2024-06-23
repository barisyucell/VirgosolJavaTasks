package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task17 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 9, 2, 6, 7, 0, 3, 1, 8, 5));
        ArrayList<Integer> orgNumbers = (ArrayList<Integer>)numbers.clone();
        ArrayList<Integer> squaresOfNumbers = new ArrayList<>();

        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);

        for (Integer number : orgNumbers) {
            squaresOfNumbers.add(number * number);
        }

        System.out.println(squaresOfNumbers);
    }

}


/*
Bir ArrayList oluşturun ve içine 10 farklı tam sayı ekleyin.
Bu sayıları küçükten büyüğe sıralayın; ardından sıralanmış listeyi tersten yazdırın.
Son olarak, listedeki her sayının karesini hesaplayarak yeni bir ArrayList içinde saklayın ve bu listeyi ekrana yazdırın.
*/