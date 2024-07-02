package day7.task6;

public class Objects {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        dog.move();
        cat.makeSound();
        cat.move();
    }

}


/*
= Hayvan Davranışları =
- "Animal" interface'i tanımlayın ve bu interface içinde "makeSound()" ve "move()" gibi metotlar belirleyin.
- Bu interface'i implement eden "Dog" ve "Cat" gibi sınıflar oluşturun.
- Her bir sınıfta interface'in metotlarını implement ederek hayvanların ses çıkarma ve hareket etme davranışlarını simüle edin.
- "Main" metodunda "Animal" referansıyla farklı türde hayvanlar (nesneler) oluşturun ve her birinin ses çıkarma ve hareket etme metotlarını çağırarak sonuçları gözlemleyin.
*/