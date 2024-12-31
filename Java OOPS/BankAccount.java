class Bank {
    double balance;
    String accountType;

    // Constructor with one parameter
    public Bank(double _balance) {
        balance = _balance;
        accountType = "Savings";
    }

    // Constructor with two parameters (overloading)
    public Bank(double _balance, String _accountType) {
        balance = _balance;
        accountType = _accountType;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public void printBal(){
        System.out.println("Balance of"+  +balance);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        // Creating an object with a single parameter constructor
        Bank acc1 = new Bank(200);

        // Creating an object with a two-parameter constructor
        Bank acc2 = new Bank(500, "Current");

        // Displaying account details
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        acc1.printBal();
    }
}
