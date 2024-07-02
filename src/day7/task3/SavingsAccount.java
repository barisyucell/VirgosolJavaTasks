package day7.task3;

public class SavingsAccount extends BankAccount {

    @Override
    public void withdraw(int amount) {
        System.out.println("Tasarruf Hesabınızdan " + amount + " lira çekmeye çalışıyorsunuz; lütfen bu parayı Mevduat Hesabınızdan çekiniz!");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Tebrikler, Tasarruf Hesabınıza " + amount + " lira yatırdınız!");
    }

}