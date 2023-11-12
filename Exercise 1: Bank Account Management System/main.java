public class Main  {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, "Foulen Ben Falten", 1000);
        BankAccount account2 = new BankAccount(67890, "El Beji", 2000);

        System.out.println("Account 1 Details:");
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Balance: $" + account1.getBalance());

        System.out.println("\nAccount 2 Details:");
        System.out.println("Account Number: " + account2.getAccountNumber());
        System.out.println("Account Holder: " + account2.getAccountHolderName());
        System.out.println("Balance: $" + account2.getBalance());

        account1.deposit(500);
        account2.withdraw(1000);

        System.out.println("\nAfter Transactions:");
        System.out.println("Account 1 Balance: $" + account1.getBalance());
        System.out.println("Account 2 Balance: $" + account2.getBalance());
    }
}
