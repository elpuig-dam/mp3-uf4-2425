package s2_s3.polimorfisme;

public class SavingsAccount extends BankAccount {

    /**
     *
     * Sobreescrivim el mètode perquè un ingrés a aquest tipus de compte
     * implica una operació especial, diferent de la heretada
     */
    @Override
    public double deposit(double amount) {
        balance += amount * 1.1;
        return  balance;
    }
}
