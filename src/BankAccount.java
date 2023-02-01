public  abstract class BankAccount {

    double balance;
    Customer owner;

    int id;

    int idCounter = 1;

    public BankAccount(double balance, Customer owner) {
        this.balance = balance;
        this.owner = owner;
        this.id = idCounter;
        idCounter++;
    }

    public abstract void setOwner(Customer owner);


    public abstract boolean withdraw(double amount);

    public int getId() {
       return this.id;


    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;


    }

    public double getBalance() {

        return this.balance;

    }

   public Customer getOwner() {
        return this.owner;

   }



}
