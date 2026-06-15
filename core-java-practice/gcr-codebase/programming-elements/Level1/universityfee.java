public class universityfee {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;

        int discount = (fee * discountPercent) / 100;
        int finalFee = fee - discount;

        System.out.print(
            "The discount amount is INR " + discount +
            " and the final fee to be paid is INR " + finalFee
        );
    }
}