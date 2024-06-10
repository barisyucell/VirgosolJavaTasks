package day4;

public class Task10 {

    public static void main(String[] args) {
        String[] days = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"};
        String day = "Perşembe";
        System.out.println("Girdiğiniz dizide " + day + " elemanının indeksi = " + indexOfElement(days, day));
    }

    public static int indexOfElement(String[] arr, String str) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(str)) {
                index = i;
                break;
            }
        }
        return index;
    }

}


// Bir dizide belirli bir değeri arayan ve bulunduğu indeksi döndüren bir metot yazın.