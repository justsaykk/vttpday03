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
        super(name, balance);
    };

    public FixedDepositAccount(String name, Float balance, Float interest) {
        super(name, balance);
        this.interest = interest;
    };

    public FixedDepositAccount(String name, Float balance, Float interest, Integer duration) {
        super(name, balance);
        this.interest = interest;
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

    @Override
    public Float getAccountBalance() {
        Float currentBalance = (super.getAccountBalance() + interest);
        System.out.printf("super.getName() is: %s \n", super.getName()); // returns with null
        System.out.printf("super.getAccountBalance is: %f \n", super.getAccountBalance()); // returns with null
        System.out.printf("The current balance is %f \n", currentBalance);
        return currentBalance;
    }
}