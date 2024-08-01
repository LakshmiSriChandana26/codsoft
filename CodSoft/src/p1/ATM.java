package p1;
import java.util.*;
public class ATM {
	private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }
    public void displayMenu() {
        System.out.println("Welcome to ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void checkBalance() {
        System.out.println("Current Balance: $" + account.getBalance());
    }

    public void depositAmount() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = s.nextDouble();
        account.deposit(amount);
    }

    public void withdrawAmount() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = s.nextDouble();
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000); 
        ATM atm = new ATM(userAccount);

        boolean exit = false;
        while (!exit) {
            atm.displayMenu();
            System.out.print("Choose an option: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    atm.depositAmount();
                    break;
                case 3:
                    atm.withdrawAmount();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        s.close();
    }
}

