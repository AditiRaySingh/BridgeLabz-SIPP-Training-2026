class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    void checkPalindrome() {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        if (text.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.checkPalindrome();
    }
}