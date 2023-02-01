public class PenguinAccount extends BankAccount {
    public PenguinAccount(double balance, Customer owner) {
        super(balance, owner);
    }

    @Override
    public void setOwner(Customer owner) {
        if (owner.getStatus().equals(Status.CHILD)) {
            this.owner = owner;

        } else {

            System.out.println("Adults can't have an penguin account");

        }


    }

    @Override
    public boolean withdraw(double amount) {
        if (this.balance - amount >= 0) {

            this.balance = this.balance - amount;

            return true;

        }

        else {

            return false;

        }

    }

}



