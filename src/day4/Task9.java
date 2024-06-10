package day4;

public class Task9 {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 0, 1, 9, 1, 0, 1};
        int numberToSearch = 1;
        int count = amountOfSpecificElement(numbers, numberToSearch);
        System.out.println("Girdiğiniz dizide toplam " + count + " adet " + numberToSearch + " elemanı mevcut");
    }

    public static int amountOfSpecificElement(int[] arr, int number) {
        int count = 0;
        for (int each : arr) {
            if (each == number) {
                count++;
            }
        }
        return count;
    }

}


// Bir dizide belirli bir değere sahip kaç adet eleman olduğunu bulan bir metot yazın.