package day6;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(findSum(3, 21.7));
        System.out.println(findSum(4.5, 14));
    }

    public static double findSum(int num1, double num2) {
        return num1 + num2;
    }

    public static double findSum(double num1, int num2) {
        return num1 + num2;
    }

}


/*
Bir sınıf oluşturun ve bu sınıfta iki farklı metot tanımlayın.
Bu metotlar aynı isme sahip olsun ama farklı parametreler alsın (overloading).
*/