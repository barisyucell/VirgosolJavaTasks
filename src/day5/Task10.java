package day5;

public class Task10 {

    public static void main(String[] args) {
        int number1 = 10;
        double number2 = 21.7;
        System.out.println(findSum(number1, number2));
        System.out.println(findSum(number2, number1));
    }

    public static double findSum(int number1, double number2) {
        return number1 + number2;
    }

    public static double findSum(double number1, int number2) {
        return number1 + number2;
    }

}


/*
"int" ve "double" tipinde iki sayının toplamını bulan iki farklı metot yazın.
Bu metotları kullanarak çeşitli toplama işlemleri yapın ve sonucu ekrana yazdırın.
*/