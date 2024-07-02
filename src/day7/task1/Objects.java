package day7.task1;

public class Objects {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.calculateArea();
        rectangle.calculateArea();
    }

}


/*
= GEOMETRİK ŞEKİLLER =
- Bir "Shape" parent sınıfı oluşturun ve bu sınıftan türeyen "Circle" ve "Rectangle" child sınıfları tanımlayın.
- "Shape" sınıfında "calculateArea()" metodunu "abstract" olarak tanımlayın ve alt sınıflarda bu metodu implement edin.
- "Main" metodunda "Shape" referansıyla farklı türde şekiller oluşturun ve her birinin alanını hesaplayarak ekrana yazdırın.
*/