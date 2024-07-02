package day7.task5;

public class Circle implements Shape {

    @Override
    public void calculateArea() {
        int r = 5;
        System.out.println("Yarıçapı " + r + " olan dairenin alanı = " + Math.round(Math.PI * r * r));
    }

    @Override
    public void calculatePerimeter() {
        int r = 3;
        System.out.println("Yarıçapı " + r + " olan dairenin çevresi = " + Math.round(2 * Math.PI * r));
    }

}