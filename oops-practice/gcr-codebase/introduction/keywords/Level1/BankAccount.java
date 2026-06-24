class BankAccount {
    static String bankName = "SBI";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display() {
        System.out.println(bankName);
        System.out.println(accountHolderName);
        System.out.println(accountNumber);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Aditi", 101);

        if (b1 instanceof BankAccount) {
            b1.display();
        }

        getTotalAccounts();
    }
}