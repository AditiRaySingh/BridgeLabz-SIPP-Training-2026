interface CouponValidator {
    boolean validateCoupon(String code);
    String getValidUntil();
}

class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {
        return code.equals("SAVE10") || code.equals("NEW50");
    }

    public String getValidUntil() {
        return "31-Dec-2026";
    }
}

public class Main {
    public static void main(String[] args) {
        String coupons[] = {"SAVE10", "HELLO20", "NEW50"};

        ShoppingCart s = new ShoppingCart();

        for (String code : coupons) {
            if (s.validateCoupon(code)) {
                System.out.println(code + " is valid");
            } else {
                System.out.println(code + " is invalid");
            }
        }

        System.out.println("Valid till: " + s.getValidUntil());
    }
}