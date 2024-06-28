package day6;

public class Task3 {

    private int age;

    public Task3(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Task3 obj = new Task3(25);
        System.out.println(obj.getAge());
    }

}


/*
Bir sınıf oluşturun ve bu sınıfa ait bir constructor tanımlayın.
Constructor içinde bir değeri başlatın ve bu değeri ekrana yazdırın.
*/