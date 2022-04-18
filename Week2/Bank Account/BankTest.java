public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(400.94, "Savings");
        account1.viewTotal();

        BankAccount account2 = new BankAccount();
        account2.deposit(500.52, "Checking");
        account2.deposit(10.42, "Savings");
        account2.withdrawal(200, "Checking");
        account2.withdrawal(600, "Savings");
        account2.viewTotal();
    }
}
