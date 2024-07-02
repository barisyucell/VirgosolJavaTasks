package day7.task3;

public class CheckingAccount extends BankAccount {

    @Override
    public void withdraw(int amount) {
        System.out.println("Mevduat Hesabınızdan " + amount + " lira çektiniz!");
    }

    @Override
    public void deposit(int amount) {
        System.out.println("Mevduat Hesabınıza " + amount + " lira yatırdınız. Birikimlerinizi Tasarruf Hesabınıza yatırabilirsiniz!");
    }

}