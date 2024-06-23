package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>(Arrays.asList(5, 11.7, true));

        for (Object object : objects) {
            System.out.println(object);
        }
    }

}


// "int", "double" ve "boolean" tiplerinde 3 farklı değeri tutan bir ArrayList oluşturun ve bu değerleri ekrana yazdırın.