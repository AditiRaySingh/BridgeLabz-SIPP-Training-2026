import java.util.Arrays;

public class NumberChecker4 {

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j++] = arr[i];
        }
        return rev;
    }

    public static boolean isEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        return isEqual(digits, reverse(digits));
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 1221;
        int[] digits = getDigits(n);

        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck: " + isDuck(digits));
    }
}