package day6;

public class Task11 {

    private String country;
    private int year;

    public Task11(String country) {
        this.country = country;
    }

    public Task11(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Task11 obj1 = new Task11("Turkey");
        Task11 obj2 = new Task11(2024);
        System.out.println(obj1.getCountry());
        System.out.println(obj2.getYear());
    }

}


/*
Bir sınıf oluşturun ve bu sınıfta iki farklı constructor tanımlayın.
Constructor'lar farklı parametreler alsın (overloading).
*/