package day6;

public class Task20Parent {

    private String car;
    private int year;

    public Task20Parent(String car, int year) {
        this.car = car;
        this.year = year;
    }

    public String getCar() {
        return car;
    }

    public int getYear() {
        return year;
    }

}


/*
Bir üst sınıf ve bir alt sınıf oluşturun.
Alt sınıf, üst sınıftan bir constructor miras alsın ve bu constructor'ı kullanarak nesne oluşturun.
*/