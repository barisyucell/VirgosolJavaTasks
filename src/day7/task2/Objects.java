package day7.task2;

public class Objects {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }

}


/*
= Polimorfik Metot Kullanımı =
- Bir "Animal" sınıfı oluşturun ve bu sınıftan türeyen "Dog" ve "Cat" sınıfları tanımlayın.
- "Animal" sınıfında "makeSound()" adında bir metot tanımlayın ve alt sınıflarda bu metodu override edin.
- "Main" metodunda "Animal" referansıyla farklı türde hayvanlar oluşturun ve her birinin sesini çıkartan metodu çağırarak sonuçları gözlemleyin.
*/