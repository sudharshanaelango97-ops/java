class Account {
    String accountHolderName;
    int accountNumber;    
    Account(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }  
    void displayAccountDetails() {
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Account Number      : " + accountNumber);
    }
}
class SavingsAccount extends Account {
    SavingsAccount(String accountHolderName, int accountNumber) {
        super(accountHolderName, accountNumber);
    }
    void displaySavingsAccount() {
        System.out.println("Account Type : Savings Account");
    }
}
class CurrentAccount extends Account {
    CurrentAccount(String accountHolderName, int accountNumber) {
        super(accountHolderName, accountNumber);
    }
    void displayCurrentAccount() {
        System.out.println("Account Type : Current Account");
    }
}
class PremiumSavingsAccount extends SavingsAccount {
    PremiumSavingsAccount(String accountHolderName, int accountNumber) {
        super(accountHolderName, accountNumber);
    }
    void displayPremiumAccount() {
        System.out.println("Account Type : Premium Savings Account");
    }
}
public class Experiment4 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Arun",1001);       
        CurrentAccount current = new CurrentAccount("Rahul",1002);
        PremiumSavingsAccount premium = new PremiumSavingsAccount("Priya",1003);
        System.out.println("----- Savings Account -----");
        savings.displayAccountDetails();
        savings.displaySavingsAccount();
        System.out.println("\n----- Current Account -----");
        current.displayAccountDetails();
        current.displayCurrentAccount();
        System.out.println("\n----- Premium Savings Account -----");
        premium.displayAccountDetails();
        premium.displaySavingsAccount();
        premium.displayPremiumAccount();
    }
}
