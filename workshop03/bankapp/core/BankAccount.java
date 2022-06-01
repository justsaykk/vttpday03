package bankapp.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * BankAccount
 */
public class BankAccount {

    private static final String LocalDateTime = null;
    // Members
    private String accountName;
    private String accountNumber = Double.toString((Math.floor(Math.random() * 1001)));
    private Float accountBalance;
    private List<String> transactions = new ArrayList<>();
    private Boolean isClosed = false;
    private LocalDate creationDate;
    private LocalDate closingDate;

    // Setter and Getters
    public String getName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public void isClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(LocalDate closingDate) {
        this.closingDate = closingDate;
    }

    // Random Number Generator

    // Constructors
    public BankAccount(String name) {
        this.accountName = name;
        // this.accountNumber = Double.toString((Math.floor(Math.random() * 1001)));
        this.accountBalance = 0f;
    }

    public BankAccount(String name, Float initialAccountBalance) {
        this.accountName = name;
        // this.accountNumber = Double.toString((Math.floor(Math.random() * 1001)));
        this.accountBalance = initialAccountBalance;
    }

    // Methods
    public void deposit(Integer amount) {
        String amountString = Integer.toString(amount);

        if (amount < 0 || isClosed) {
            System.out.println("IllegalArgumentException\n");
        } else {
            transactions.add("deposited $" + amountString + " at " + LocalDateTime);
            System.out.printf("You have deposited $%d \n", amount);
        }
    }

    public void withdraw(Integer amount) {
        String amountString = Integer.toString(amount);
        if (amount < 0 || isClosed) {
            System.out.println("IllegalArgumentException\n");
        } else {
            transactions.add("withdrew $" + amountString + " at " + LocalDateTime);
            System.out.printf("You have withdrew $%d\n", amount);
        }
    }
}