package s2_s3.polimorfisme;

public class BankingMain {
    public static void main(String[] args) {
        BankAccount account2DAM = new BankAccount();
        account2DAM.deposit(50000);
        System.out.println("Saldo disponible: " + account2DAM.getBalance());

        SavingsAccount estalvis2DAM = new SavingsAccount();
        estalvis2DAM.deposit(100000);
        System.out.println("Estalvis acumulats: " + estalvis2DAM.getBalance());
    }
}
