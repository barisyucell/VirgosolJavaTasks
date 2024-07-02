package day7;

public class Task7 {

    public static void main(String[] args) {
        System.out.println("Started!");

        try {
            Thread.sleep(5000);
            System.out.println("5 sn beklendi");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Finished!");
    }

}


/*
= "Thread.sleep(5000)" =
- "Thread.sleep()" metodu kullanın.
- try-catch bloğu ile kodu çalışabilir hale dönüştürün.
*/