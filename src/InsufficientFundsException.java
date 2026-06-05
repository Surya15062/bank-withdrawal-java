public class InsufficientFundsException extends RuntimeException {

   private final double balance;
   private final double amount;

    public InsufficientFundsException( double balance, double amount) {

        super("Insufficient funds! Balance: ₹" + balance
                + ", Requested: ₹" + amount);

        this.balance = balance;
        this.amount = amount;
    }
    public double getBalance(){
        return balance;
    }
    public double getShortfall(){
        return amount - balance;
    }
}
