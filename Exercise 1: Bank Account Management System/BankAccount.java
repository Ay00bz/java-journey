class BankAccount {
    private long accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount() {
    }

    public BankAccount(long acc, String name, int bal) {
        accountNumber = acc;
        accountHolderName = name;
        balance = bal;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int x) {
        balance += x;
    }

    public void withdraw(int x) {
        if (x <= balance) {
            balance -= x;
        } else {
            System.out.println("Insufficient funds. Cannot withdraw.");
        }
    }

    public static void main(String[] args) {
        // Create two BankAccount instances
        BankAccount account1 = new BankAccount(12345, "John Doe", 1000);
        BankAccount account2 = new BankAccount(67890, "Jane Smith", 2000);

        // Display initial account information
        System.out.println("Account 1 Details:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Balance: $" + account1.getBalance());

        System.out.println("\nAccount 2 Details:");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Account Holder: " + account2.getAccountHolderName());
        System.out.println("Balance: $" + account2.getBalance());

        // Perform transactions
        account1.deposit(500);
        account2.withdraw(1000);

        // Display updated account information
        System.out.println("\nAfter Transactions:");
        System.out.println("Account 1 Balance: $" + account1.getBalance());
        System.out.println("Account 2 Balance: $" + account2.getBalance());
    }
}
