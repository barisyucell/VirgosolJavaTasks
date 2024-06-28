package day6;

public class Task10 {

    private String movie;
    private int year;

    public Task10(String movie, int year) {
        this.movie = movie;
        this.year = year;
    }

    public static void main(String[] args) {
        Task10 obj = new Task10("Back to the Future", 1985);
        System.out.println(obj.movie);
        System.out.println(obj.year);
    }

}


/*
Bir sınıf oluşturun ve bu sınıfta bir constructor tanımlayın.
Constructor içinde iki değişkeni başlatın ve bu değişkenlerin değerlerini ekrana yazdırın.
*/