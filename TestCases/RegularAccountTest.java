import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RegularAccountTest {
    Customer morten = new Customer("Morten", Status.REGULAR, new ArrayList<>());
    BankAccount account1 = new SalaryAccount(10000, morten, -10000);
    @Test
    void deposit() {
        account1.deposit(4000);
        assertEquals(14000, account1.getBalance());

    }

    @Test
    void getBalance() {

        assertEquals(10000, account1.getBalance());
    }

    @Test
    void getOwner() {

        assertEquals(morten, account1.getOwner());


    }

    @Test
    void setOwner() {
        Customer kage = new Customer("Kage", Status.CHILD, new ArrayList<>());
        account1.setOwner(kage);
        assertEquals(morten, account1.getOwner());

    }

    @Test
    void withdraw() {
        account1.withdraw(1000);
        assertEquals(9000, account1.getBalance());


    }
}