class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ATM_Withdrawal_System {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if(amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance");
        }

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 8000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}