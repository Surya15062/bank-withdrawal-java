public class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(double amount) {
        super("Invalid withdrawal amount: ₹" + amount
                + ". Must be greater than zero.");
    }
}
