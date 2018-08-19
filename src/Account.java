import java.util.ArrayList;
import java.util.Currency;

public class Account {
    private float balance;
    private ArrayList<Customer> accountOwners;
    private float interestRate;
    private boolean allowOverdraft;
    // TODO: Add ability to have a transaction log with a description and date for the transaction.

    public Account(ArrayList<Customer> customers, float intRate, boolean allowOverdraft){
        this.accountOwners = customers;
        this. interestRate = intRate;
        this.allowOverdraft = allowOverdraft;
    }

    public float getBalance(){
        return balance;
    }
    public void deposit(float amt){
        balance += amt;
    }
    public void withdraw(float amt){
        if (allowOverdraft == true) {
            balance -= amt;
        }
        else {
            if ((balance - amt) < 0) {
                System.out.println("Insufficient Funds");
                // TODO: Throw Exception
            }
        }
        
    }
    public addOwner(Customer cust) {
        this.accountOwners.add(cust);
    }
    public removeOwner(Customer cust) {
        this.accountOwners.remove(cust);
    }
    public ArrayList getOwners(){
        return this.accountOwners;
    }

    public float getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(float rate) {
        interestRate = rate;
    }
    public boolean isOverdraftAllowed() {
        return allowOverdraft;
    }
    public void allowOverdraft() {
        allowOverdraft = true;
    }
    public void denyOverdraft(){
        allowOverdraft = false;
    }
    
}
