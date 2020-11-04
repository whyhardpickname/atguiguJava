package exercise;

/**
 * @author MarkChern
 * date 2020/11/5 7:00
 */
public class Customer
{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName, Account account)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }

    @Override
    public String toString()
    {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
