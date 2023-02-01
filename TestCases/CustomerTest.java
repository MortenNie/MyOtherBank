import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer morten = new Customer("Morten", Status.REGULAR, new ArrayList<>());
    BankAccount account1 = new SalaryAccount(10000, morten, -10000);

    @org.junit.jupiter.api.Test
    void addAccount() {
        morten.addAccount(account1);
        assertEquals(account1, morten.getAccounts().get(0));

    }

    @org.junit.jupiter.api.Test
    void removeAccount() {
        morten.addAccount(account1);
        morten.removeAccount(account1);
        assertEquals(0, morten.getAccounts().size());

    }

    @org.junit.jupiter.api.Test
    void setName() {
        morten.setName("Kage");
        assertEquals("Kage", morten.getName());
    }

    @org.junit.jupiter.api.Test
    void setStatus() {
        morten.setStatus(Status.VIP);
        assertEquals(Status.VIP, morten.getStatus());

    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Morten", morten.getName());
    }

    @org.junit.jupiter.api.Test
    void getStatus() {
        assertEquals(Status.REGULAR, morten.getStatus());

    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertEquals(1, morten.getId());

    }
}