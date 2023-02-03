import java.util.ArrayList;

public class Customer {
   private String name;
   private Status status;
   private int id;
   private ArrayList<BankAccount> accounts;
   private int idCounter = 1;

    public Customer(String name, Status status, ArrayList<BankAccount> accounts) {
        this.name = name;
        this.status = status;
        this.id = idCounter;
        this.accounts = accounts;
        idCounter++;



    }

    public void addAccount(BankAccount account) {

        this.accounts.add(account);

    }

    public void removeAccount(BankAccount account) {

        this.accounts.remove(account);

    }

    public void setName (String name) {
        if (name.equals(null) || name.contains("1") || name.contains("2")) {

            throw  new IllegalArgumentException("Dont use numbers or illegal characters in your name");
        }

        else {

            this.name = name;

        }

    }

    public void setStatus(Status status) {

        this.status = status;

    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public int getId() {
        return id;

    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }
}
