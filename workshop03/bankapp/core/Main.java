package bankapp.core;

import java.time.LocalDate;
import java.util.Date;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Date now = new Date();
        BankAccount kkAccount = new BankAccount("Woo Kai Kein");
        kkAccount.setAccountBalance(5000.50f);
        kkAccount.setCreationDate(now);
        kkAccount.deposit(200);
        kkAccount.withdraw(200);
        kkAccount.getTransactions();
    }
}