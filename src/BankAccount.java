public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String holder, double initialBalance) {
        this.accountHolder = holder;
        this.balance = initialBalance;
    }

    public void withdrawal(double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful! ₹" + amount + " debited.");
        System.out.println("New balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }
}