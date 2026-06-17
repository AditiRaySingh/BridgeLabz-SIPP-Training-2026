class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class Hospital_Billing_System  {

    static void processPayment(double balance, double amount)
            throws InsufficientFundsException {

        if(amount > balance) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds");
        }

        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        int[] patients = {101,102,103};

        try {

            int bill = 1000;
            int items = 0;

            System.out.println(bill/items);

        } catch (ArithmeticException e) {
            System.out.println("Bill cannot be divided by zero items.");
        }

        try {

            System.out.println(patients[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid patient index.");
        }

        try {

            int amount = Integer.parseInt("abc");

        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }

        try {

            processPayment(5000,7000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}