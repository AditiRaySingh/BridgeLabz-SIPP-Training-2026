import java.util.Scanner;

public class LowerCaseCompare {

    // User-defined method to convert to lowercase
    static String convertToLower(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            result += ch;
        }

        return result;
    }

    // Compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String userLower = convertToLower(text);

        // Built-in method
        String builtInLower = text.toLowerCase();

        System.out.println("User Defined Lowercase : " + userLower);
        System.out.println("Built-in Lowercase     : " + builtInLower);

        boolean result = compareStrings(userLower, builtInLower);

        System.out.println("Are both results same? " + result);

        sc.close();
    }
}