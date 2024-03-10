package chatGPT;

import java.util.Scanner;

public class ATM 
{
    private double balance;

    public ATM(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public void displayMenu()
    {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance() 
    {
        System.out.println("Current Balance: $" + balance);
    }

    public void deposit(double amount) 
    {
        balance = balance + amount;
        System.out.println("Deposit successful. Current Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Withdrawal successful. Current Balance: $" + balance);
        } 
        else 
        {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Create an ATM instance with an initial balance of $500
        ATM atm = new ATM(500);
        
        boolean taskEnd = true;

        while (taskEnd) 
        {
            // Display menu
            atm.displayMenu();

            // Get user choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Perform the selected transaction
            switch (choice) 
            {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    taskEnd = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            scanner.close();
        }
    }
}
