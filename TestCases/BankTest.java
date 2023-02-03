import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    Customer morten = new Customer("Morten", Status.REGULAR, new ArrayList<>());
    BankAccount account1 = new SalaryAccount(10000, morten, -10000);

    Customer maria = new Customer("Maria", Status.REGULAR, new ArrayList<>());
    BankAccount account2 = new SalaryAccount(10000, maria, -10000);

    @Test
    void transferMoney() {
        Bank bank = new Bank();
        bank.transferMoney(account1, account2, 5000);
        assertEquals(5000, account1.getBalance());
        assertEquals(15000, account2.getBalance());


    }
}