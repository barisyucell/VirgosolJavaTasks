package day7.task3;

public class Objects {

    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount();
        obj1.deposit(1000);
        obj1.withdraw(2000);

        CheckingAccount obj2 = new CheckingAccount();
        obj2.deposit(3000);
        obj2.withdraw(4000);
    }

}


/*
= Banka Hesapları =
- Bir "BankAccount" abstract sınıfı tanımlayın ve "withdraw()" ve "deposit()" gibi abstract metotlar ekleyin.
- Bu sınıftan türeyen "SavingsAccount" (Tasarruf Hesabı) ve "CheckingAccount" (Mevduat Hesabı) sınıfları oluşturun ve bu metotları implement edin.
- Her iki hesap türünden örnekler oluşturun ve her biri için para yatırma ("deposit") ve para çekme ("withdraw") işlemleri gerçekleştirin.
*/