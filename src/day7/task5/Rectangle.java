package day7.task5;

public class Rectangle implements Shape {

    @Override
    public void calculateArea() {
        int a = 6, b = 10;
        System.out.println("Kenar uzunlukları " + a + " ve " + b + " olan dikdörtgenin alanı = " + (a * b));
    }

    @Override
    public void calculatePerimeter() {
        int a = 4, b = 7;
        System.out.println("Kenar uzunlukları " + a + " ve " + b + " olan dikdörtgenin çevresi = " + (2 * (a + b)));
    }

}