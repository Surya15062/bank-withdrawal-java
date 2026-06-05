import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("Surya", 5000);

        System.out.println("1. Withdraw");
        System.out.println("2. Exit");
        System.out.print("Choose option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                try {
                    System.out.print("Enter withdrawal amount: ₹");
                    double amount = scanner.nextDouble();
                    account.withdrawal(amount);
                } catch (InvalidAmountException e) {
                    System.out.println("Invalid Amount: " + e.getMessage());
                } catch (InsufficientFundsException e) {
                    System.out.println("Error: " + e.getMessage());
                    System.out.println("Shortfall: ₹" + e.getShortfall());
                } finally {
                    System.out.println("--- Transaction logged ---");
                }
                break;

            case 2:
                System.out.println("Thank you for banking with us. Goodbye!");
                break;

            default:
                System.out.println("Invalid option. Please enter 1 or 2.");
        }

        scanner.close();
    }
}