package bankapp.core;

import java.time.LocalDate;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        BankAccount kkAccount = new BankAccount("Woo Kai Kein");
        kkAccount.setAccountBalance(5000.50f);
        kkAccount.setCreationDate(LocalDate.now());
        kkAccount.deposit(200);
        kkAccount.withdraw(200);
    }
}