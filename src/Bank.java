import java.util.Scanner;

public class Bank {

    public boolean transferMoney(BankAccount a, BankAccount b, int c) {

        if (a == null || b == null || c < 0) {

            throw new IllegalArgumentException();

        } else {

            boolean withdrawStatus = a.withdraw(c);

            if (withdrawStatus == true) {
                b.deposit(c);
                return true;

            } else {
                System.out.println("Transfer failed, you dont have enough money");
                return false;

            }


        }

    }
}
