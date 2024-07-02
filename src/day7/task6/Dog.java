package day7.task6;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Hav hav");
    }

    @Override
    public void move() {
        System.out.println("Köpek koştu");
    }

}