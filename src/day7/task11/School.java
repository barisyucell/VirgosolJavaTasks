package day7.task11;

public class School {

    public static String schoolName = "İTÜ";

    public static boolean isFavorForBeingStudent(int age) {
        if (age >= 6 && age <= 16) return true;
        return false;
    }

}


/*
= "static" practice =
- "School" isimli bir class oluşturun.
- Statik değişken olarak "schoolName" ataması yapın.
- Statik bir metot ("isFavorForBeingStudent(int age)") tanımlayın.
  Metot parametre olarak yaş bilgisini alsın.
  "6 <= age <= 16" aralığında ise true, değilse false dönen bir yapı kurun.
- Başka bir Java classından nesne yaratmadan statik değişken ve metoda erişelim.
*/