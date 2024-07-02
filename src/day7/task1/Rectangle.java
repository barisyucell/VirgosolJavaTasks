package day7.task1;

public class Rectangle extends Shape {

    @Override
    public void calculateArea() {
        int a = 3, b = 8;
        System.out.println("Dikdörtgenin alanı = " + (a * b));
    }

}