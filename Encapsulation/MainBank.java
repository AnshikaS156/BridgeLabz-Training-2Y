interface Loanable {
    void applyForLoan();
    void calculateLoanEligibility();
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { if (balance >= amt) balance -= amt; }

    abstract void calculateInterest();

    public void showDetails() {
        System.out.println(holderName + " | Acc No: " + accountNumber + " | Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int no, String name, double bal) { super(no, name, bal); }
    public void calculateInterest() { System.out.println("Interest: ₹" + balance * 0.04); }
    public void applyForLoan() { System.out.println("Loan Applied: Savings Account"); }
    public void calculateLoanEligibility() { System.out.println("Eligible up to ₹1,00,000"); }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int no, String name, double bal) { super(no, name, bal); }
    public void calculateInterest() { System.out.println("Interest: ₹" + balance * 0.02); }
    public void applyForLoan() { System.out.println("Loan Applied: Current Account"); }
    public void calculateLoanEligibility() { System.out.println("Eligible up to ₹2,00,000"); }
}

public class MainBank {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount(1001, "Anshika", 50000);
        BankAccount acc2 = new CurrentAccount(1002, "Riya", 100000);

        acc1.showDetails(); acc1.calculateInterest();
        acc2.showDetails(); acc2.calculateInterest();
    }
}
