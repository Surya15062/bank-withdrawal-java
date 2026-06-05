# 🏦 Bank Account Withdrawal — Java Exception Handling

A beginner-friendly Java project that demonstrates **Exception Handling** through a realistic bank account withdrawal simulation. Learn how to create custom exceptions, use try-catch-finally blocks, and apply business logic validation.

\---

## 📁 Project Structure

```
bank-withdrawal-java/
│
├── src/
│   ├── BankAccount.java               # Core account class with withdraw logic
│   ├── InsufficientFundsException.java # Custom exception — overdraft scenario
│   ├── InvalidAmountException.java     # Custom exception — invalid input scenario
│   └── Main.java                       # Entry point with all test scenarios
│
└── README.md
```

\---

## 💡 Concepts Covered

|Concept|Description|
|-|-|
|`try`|Wraps risky code that may throw an exception|
|`catch`|Handles a specific exception type gracefully|
|`finally`|Always runs — used for logging / cleanup|
|`throw`|Manually throws an exception to enforce business rules|
|`throws`|Declares that a method may propagate a checked exception|
|Custom Exception|Extending `RuntimeException` to create meaningful error types|

\---

## ⚙️ How It Works

The `BankAccount.withdraw(double amount)` method enforces two rules:

1. **Amount must be greater than zero** → throws `InvalidAmountException`
2. **Amount must not exceed balance** → throws `InsufficientFundsException`

If both rules pass, the balance is deducted and the transaction is logged via the `finally` block.

\---

## 🧪 Test Scenarios (in Main.java)

```
=== Withdrawal Attempt: ₹1500 ===
✓ Withdrawal successful! ₹1500.0 debited.
  New balance: ₹3500.0
--- Transaction logged ---

=== Withdrawal Attempt: ₹9000 ===
✗ Insufficient funds! Balance: ₹3500.0, Requested: ₹9000.0
  Shortfall: ₹5500.0
--- Transaction logged ---

=== Withdrawal Attempt: ₹-500 ===
✗ Invalid withdrawal amount: ₹-500.0. Must be greater than zero.
--- Transaction logged ---
```

\---

## 🚀 How to Run

**Prerequisites:** Java JDK 8 or higher installed.

```bash
# 1. Clone the repository
git clone https://github.com/YOUR\_USERNAME/bank-withdrawal-java.git
cd bank-withdrawal-java

# 2. Compile all Java files
javac src/\*.java -d out/

# 3. Run the program
java -cp out/ Main
```

Or open the project in **IntelliJ IDEA** / **Eclipse** and run `Main.java` directly.

\---

## 🗂️ Exception Hierarchy

```
Throwable
 └── Exception
      └── RuntimeException
           ├── InsufficientFundsException  ← custom (this project)
           └── InvalidAmountException      ← custom (this project)
```

Both custom exceptions extend `RuntimeException` (unchecked), so callers are not forced to catch them — but they should.

\---

## 📚 Key Takeaway

> Exceptions don't crash programs — \*\*unhandled\*\* exceptions do.  
> By wrapping risky code in `try-catch`, you stay in control of your program's flow.

\---

## 🙋 Author

**Surya S**  
B.Tech in Information Technology 
GitHub: https://github.com/Surya15062

LinkedIn: https://linkedin.com/in/s-surya-6b9b6329b

\---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

