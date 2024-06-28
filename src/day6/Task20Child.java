package day6;

public class Task20Child extends Task20Parent {

    public Task20Child(String car, int year) {
        super(car, year);
    }

    public static void main(String[] args) {
        Task20Child obj = new Task20Child("Opel", 2018);
        System.out.println(obj.getCar());
        System.out.println(obj.getYear());
    }

}