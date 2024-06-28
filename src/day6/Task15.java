package day6;

public class Task15 {

    private String animal;

    public Task15(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public static void main(String[] args) {
        Task15 obj = new Task15("Cat");
        System.out.println(obj.getAnimal());
    }

}


/*
Bir sınıf oluşturun ve bu sınıfta bir constructor tanımlayın.
Constructor içinde bir değeri başlatın ve bu değeri getter metodu ile ekrana yazdırın.
*/