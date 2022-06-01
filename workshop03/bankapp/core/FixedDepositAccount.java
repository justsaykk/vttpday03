package bankapp.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FixedDepositAccount {
    private String accountName;
    private String accountNumber = Double.toString((Math.floor(Math.random() * 1001)));
    private Float accountBalance;
    private List<String> transactions = new ArrayList<>();
    private Boolean isClosed = false;
    private LocalDate creationDate;
    private LocalDate closingDate;
    private Float interest;
    private Integer duration;

    // Setters and Getters
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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
    public Boolean getIsClosed() {
        return isClosed;
    }
    public void setIsClosed(Boolean isClosed) {
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
    public Float getInterest() {
        return interest;
    }
    public void setInterest(Float interest) {
        this.interest = interest;
    }
    public Integer getDuration() {
        return duration;
    }
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    
}
