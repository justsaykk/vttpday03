package bankapp.core;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * BankAccount
 */
public class BankAccount {

    // Members
    private String accountName;
    private String accountNumber = UUID.randomUUID().toString().substring(0, 8);
    private Float accountBalance = 0f;
    private List<String> transactions = new ArrayList<>();
    private Boolean isClosed = false;
    private Date creationDate;
    private Date closingDate;

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
        System.out.print(transactions);
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public void isClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    // Random Number Generator

    // Constructors
    public BankAccount() {
    }; // Constructor for class extensions

    public BankAccount(String name) {
        this.accountName = name;
        // this.accountNumber = Double.toString((Math.floor(Math.random() * 1001)));
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
            Date now = new Date();
            transactions.add("deposited $" + amountString + " at " + now);
            System.out.printf("You have deposited $%d \n", amount);
        }
    }

    public void withdraw(Integer amount) {
        String amountString = Integer.toString(amount);
        if (amount < 0 || isClosed) {
            System.out.println("IllegalArgumentException\n");
        } else {
            Date now = new Date();
            transactions.add("withdrew $" + amountString + " at " + now);
            System.out.printf("You have withdrew $%d\n", amount);
        }
    }
}