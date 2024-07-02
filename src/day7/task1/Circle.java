package day7.task1;

public class Circle extends Shape {

    @Override
    public void calculateArea() {
        int radius = 4;
        System.out.println("Çemberin alanı = " + (3.14 * radius * radius));
    }

}