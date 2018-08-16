import java.util.ArrayList;
import java.util.Date;

public class Customer extends Person {
    private ArrayList<String> accountNumbers;
    private Date customerInitDate;

    public Customer(String firstName, String lastName, String emailAddress) {
        super(firstName, lastName, emailAddress);
        Date today = new Date();
        today.setTime(0);
        customerInitDate = today;
    }

    public void addAccount(String accountNumber){
        accountNumbers.add(accountNumber);
    }
    public void removeAccount(String accountNumber){
        accountNumbers.remove(accountNumber);
    }

    public ArrayList<String> getAccountNumbers() {
        return accountNumbers;
    }

    public Date getCustomerInitDate() {
        return customerInitDate;
    }

    public void setCustomerInitDate(Date customerInitDate) {
        this.customerInitDate = customerInitDate;
    }
}
