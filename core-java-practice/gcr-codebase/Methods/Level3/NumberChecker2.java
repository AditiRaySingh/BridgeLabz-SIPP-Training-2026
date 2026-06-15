public class NumberChecker2 {

    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int n, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == n;
    }

    public static int[] largestTwo(int[] digits) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2) {
                max2 = d;
            }
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestTwo(int[] digits) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2) {
                min2 = d;
            }
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        int n = 153;
        int[] digits = getDigits(n);

        System.out.println("Duck: " + isDuckNumber(digits));
        System.out.println("Armstrong: " + isArmstrong(n, digits));

        int[] large = largestTwo(digits);
        int[] small = smallestTwo(digits);

        System.out.println("Largest: " + large[0] + ", " + large[1]);
        System.out.println("Smallest: " + small[0] + ", " + small[1]);
    }
}