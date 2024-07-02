package day7.task4;

public class Objects {

    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.start();
        car.stop();
        motorcycle.start();
        motorcycle.stop();
    }

}


/*
= Araba Arabirimleri =
- "Vehicle" adında bir soyut sınıf tanımlayın ve "start()" ve "stop()" gibi abstract metotlar ekleyin.
- Bu sınıftan türeyen "Car" ve "Motorcycle" sınıfları oluşturun ve bu metotları implement edin.
- Her iki araç türünden örnekler oluşturun ve her biri için start ve stop işlemleri gerçekleştirin.
*/