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

# 🧪 Test Scenarios (in Main.java)
 
The program runs interactively via `Scanner`. Choose an option from the menu and enter an amount.
 
**Scenario 1 — Successful withdrawal (₹1500)**
```
1. Withdraw
2. Exit
Choose option: 1
Enter withdrawal amount: ₹1500
Withdrawal successful! ₹1500.0 debited.
New balance: ₹3500.0
--- Transaction logged ---
```
 
**Scenario 2 — Overdraft attempt (₹9000)**
```
1. Withdraw
2. Exit
Choose option: 1
Enter withdrawal amount: ₹9000
Error: Insufficient funds! Balance: ₹3500.0, Requested: ₹9000.0
Shortfall: ₹5500.0
--- Transaction logged ---
```
 
**Scenario 3 — Invalid negative amount (₹-500)**
```
1. Withdraw
2. Exit
Choose option: 1
Enter withdrawal amount: ₹-500
Invalid Amount: Invalid withdrawal amount: ₹-500.0. Must be greater than zero.
--- Transaction logged ---
```
 
**Scenario 4 — Exit**
```
1. Withdraw
2. Exit
Choose option: 2
Thank you for banking with us. Goodbye!
```
 
---
 

## 🚀 How to Run

**Prerequisites:** Java JDK 8 or higher installed.

```bash
# 1. Clone the repository
git clone https://github.com/Surya15062/bank-withdrawal-java.git
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
GitHub: [@Surya15062](https://github.com/Surya15062)  
LinkedIn: [s-surya-6b9b6329b](https://linkedin.com/in/s-surya-6b9b6329b)
 
---


## 📄 License

This project is open source and available under the [MIT License](LICENSE).

