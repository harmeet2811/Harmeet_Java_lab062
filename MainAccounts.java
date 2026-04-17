import java.util.Scanner;
abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHoldersName;
    String address;

    Accounts(int accNo, String name, String addr, double balance) {
        this.accountNumber = accNo;
        this.accountHoldersName = name;
        this.address = addr;
        this.balance = balance;
    }

    abstract void withdrawl(double amount);
    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHoldersName);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(int accNo, String name, String addr, double balance, double roi) {
        super(accNo, name, addr, balance);
        this.rateOfInterest = roi;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdrawl(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}

public class MainAccounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String addr = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double roi = sc.nextDouble();

        SavingsAccount acc = new SavingsAccount(accNo, name, addr, balance, roi);

        System.out.print("\nEnter amount to deposit: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        double wd = sc.nextDouble();
        acc.withdrawl(wd);
        acc.calculateAmount();
        System.out.println("\n--- Account Details ---");
        acc.display();

        sc.close();
    }
}
