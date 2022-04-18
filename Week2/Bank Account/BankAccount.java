public class BankAccount {
        
    // declare attributes
    private double checking;
    private double savings;
    private double totalAmount;
    
    // static
    public static int numberAccounts;
    public static double totalMoney;

    
    // methods
    public void BankAcc() {
        BankAccount.numberAccounts += 1;
        this.checking = 0;
        this.savings = 0;
    }

    public void deposit(double money, String accountType) {
        if(accountType.equals("Checking")) {
            this.checking += money;
        }
        else if(accountType.equals("Savings")) {
            this.savings += money;
        }
        BankAccount.totalMoney += money;
        this.totalAmount += money;
    }

    public void withdrawal(double money, String accountType) {
        if(accountType.equals("Checking")) {
            if(this.checking - money >= 0) {
                this.checking -= money;
                BankAccount.totalMoney -= money;
                this.totalAmount -= money;
            }
            else {
                System.out.println("You have insufficient funds to withdraw $" + money);
            }
        }
        else if(accountType.equals("Savings")) {
            if(this.savings - money >= 0) {
                this.savings -= money;
                BankAccount.totalMoney -= money;
                this.totalAmount -= money;
            }
            else {
                System.out.println("You have insufficient funds to withdraw $" + money);
            }
        }
    }

    public void viewTotal() {
        System.out.printf("Checking: $%s \n", this.checking);
        System.out.printf("Savings: $%s \n", this.savings);
        System.out.printf("Total: $%s \n", this.totalAmount);
    }

    // getters and setters
    public double getChecking() {
        return this.checking;
    }

    public double getSavings() {
        return this.savings;
    }
}