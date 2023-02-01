import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer morten = new Customer("Morten", Status.REGULAR, new ArrayList<>());
        BankAccount account2 = new SalaryAccount(10000, morten, -10000 );

    }

}