public class SalaryAccount extends BankAccount {

    private int creditLimit;

    public SalaryAccount(double balance, Customer owner, int creditLimit) {
        super(balance, owner);
        this.creditLimit = creditLimit;
    }

    public void setOwner(Customer owner) {
        if (owner.getStatus().equals(Status.REGULAR) || owner.getStatus().equals(Status.VIP)) {
            this.owner = owner;


        }

        else {
            System.out.println("Underage can't have a regular account with us");

        }

    }

    public boolean withdraw(double amount) {

        if (this.balance - amount >= this.creditLimit) {

              this.balance = this.balance - amount;

              return true;

        }

        else {

            return false;

        }

    }



}
