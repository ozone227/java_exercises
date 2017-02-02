/**
 * @author Ryan Bond
 * https://github.com/ozone227 - drbond@gmail.com
 *
 */

// Create Account Class
public class Account {
    static int numberOfAccounts = 0;
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance = 0.0;

    public Account(){
        setAccountNumber();
    }

    public Account(String firstName, String lastName){
        setAccountNumber();
        setName(firstName, lastName);
    }

    public Account(String firstName, String lastName, double balance){
        setAccountNumber();
        setName(firstName, lastName);
        setBalance(balance);
    }

    private void setBalance(double balance){
        this.balance = balance;
    }

    private void setAccountNumber(){
        Account.numberOfAccounts++;
        accountNumber = Account.numberOfAccounts;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    private void setName(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    private void setFirstName(String name){
        firstName = name;
    }

    private void setLastName(String name){
        lastName = name;
    }

    public double getBalance(){
        return balance;
    }

 // Create Methods to Calculate Transactions
    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public double withdraw(double amount){
        balance -= amount;
        return balance;
    }
}
