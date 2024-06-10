package day4;

public class Task17 {

    public static void main(String[] args) {
        System.out.println(isElementExist(new String[] {"Toyota", "Opel", "Mercedes", "Honda", "Renault"}, "hONdA"));
    }

    public static boolean isElementExist(String[] arr, String str) {
        boolean isExist = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(str)) {
                isExist = true;
            }
        }
        return isExist;
    }

}


/*
Bir dizide belirli bir elemanın bulunup bulunmadığını kontrol eden bir metot yazın
(ipucu: method true veya false olarak değer dönmeli).
*/