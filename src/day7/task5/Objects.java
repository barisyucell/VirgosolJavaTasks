package day7.task5;

public class Objects {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.calculateArea();
        circle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }

}


/*
= Şekil Hesapları =
- Bir "Shape" interface'i tanımlayın ve bu interface içinde "calculateArea()" ve "calculatePerimeter()" gibi metotlar belirleyin.
- Bu interface'i implement eden "Circle" ve "Rectangle" gibi sınıflar oluşturun.
- Her bir sınıfta interface'in metotlarını implement ederek şekillerin alanını ve çevresini hesaplayın.
- "Main" metodunda "Shape" referansıyla farklı türde şekiller (nesneler) oluşturun ve her birinin alanını ve çevresini hesaplayarak ekrana yazdırın.
*/