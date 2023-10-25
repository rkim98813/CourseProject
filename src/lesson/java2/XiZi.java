package lesson;

class Account {
    String ownerName;
    double balance;

    // Constructor to initialize ownerName and balance
    public Account() {
        ownerName = "";
        balance = 0.0;
    }

    // Constructor to set ownerName and initial balance
    public Account(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class XiZi{
    public static void main(String[] args) {
        Account ac1 = new Account("이민규", 2000000);
        ac1.deposit(100000);
        ac1.withdraw(50000);
        System.out.println(ac1.balance);
    }
}
