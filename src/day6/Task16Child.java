package day6;

public class Task16Child extends Task16Parent {

    public Task16Child(String car, int year) {
        super(car, year);
    }

    public static void main(String[] args) {
        Task16Child obj = new Task16Child("Opel", 2018);
        System.out.println(obj.getCar());
        System.out.println(obj.getYear());
    }

}