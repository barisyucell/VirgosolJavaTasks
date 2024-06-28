package day6;

public class Task7 {

    private String name = "Ali";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Task7 obj = new Task7();
        System.out.println("Varsayılan isim: " + obj.getName());
        obj.setName("Mehmet");
        System.out.println("Güncellenen isim: " + obj.getName());
    }

}


/*
Bir sınıf oluşturun ve bu sınıfta private bir değişken tanımlayın.
Bu değişkeni getter ve setter metotları ile güncelleyin ve ekrana yazdırın.
*/