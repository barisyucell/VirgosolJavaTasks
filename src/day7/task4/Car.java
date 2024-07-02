package day7.task4;

public class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Araba start edildi!");
    }

    @Override
    public void stop() {
        System.out.println("Araba stop edildi!");
    }

}