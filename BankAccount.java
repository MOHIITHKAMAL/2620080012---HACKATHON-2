import java.util.Scanner;

class BankAccount {
    // Data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money if sufficient balance is available
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to return the current balance
    public double checkBalance() {
        return balance;
    }

    // Method to display account details and balance
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading account details and initial balance
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();
        
        System.out.print("Enter Account Holder Name: ");
        String holderName = sc.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        // Create object using the parameterized constructor
        BankAccount account = new BankAccount(accNum, holderName, initialBalance);

        // Perform one deposit operation
        System.out.print("Enter deposit amount: ");
        double depAmt = sc.nextDouble();
        account.deposit(depAmt);

        // Perform one withdrawal operation
        System.out.print("Enter withdrawal amount: ");
        double withAmt = sc.nextDouble();
        account.withdraw(withAmt);

        // Display the final account details
        System.out.println("\n--- Final Account Details ---");
        account.displayAccount();

        sc.close();
    }
}
