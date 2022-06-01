package bankapp.core;

/**
 * FixedDepositAccount
 */
public class FixedDepositAccount extends BankAccount {

    // Members
    private Float interest = 3f;
    private Integer duration = 6;

    // Constructors
    public FixedDepositAccount(String name, Float balance) {
    };

    public FixedDepositAccount(String name, Float balance, Float interest) {
        this.interest = interest;
    };

    public FixedDepositAccount(String name, Float balance, Float interest, Integer duration) {
        this(name, balance, interest);
        this.duration = duration;
    }

    @Override
    public void deposit(Integer amount) {
        return;
    }

    @Override
    public void withdraw(Integer amount) {
        return;
    };

    public Float getAccountBalance() {
        Float currentBalance = super.getAccountBalance() + interest;
        System.out.printf("The current balance is %f", currentBalance);
        return currentBalance;
    }

}