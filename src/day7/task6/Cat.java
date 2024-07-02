package day7.task6;

public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Miyav");
    }

    @Override
    public void move() {
        System.out.println("Kedi ağaca tırmandı");
    }

}