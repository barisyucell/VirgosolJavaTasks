package day7.task4;

public class Motorcycle extends Vehicle {

    @Override
    public void start() {
        System.out.println("Motosiklet start edildi!");
    }

    @Override
    public void stop() {
        System.out.println("Motosiklet stop edildi!");
    }

}