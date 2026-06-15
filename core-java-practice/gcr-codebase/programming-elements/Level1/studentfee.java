import java.util.Scanner;

public class studentfee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee, discountPercent;

        System.out.print("Enter the fee: ");
        fee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.print(
            "The discount amount is INR " + discount +
            " and final discounted fee is INR " + finalFee
        );
    }
}