import java.util.Scanner;

public class CompareStrings {

    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.next();

        System.out.print("Enter Second String: ");
        String str2 = sc.next();

        boolean charAtResult = compareStrings(str1, str2);
        boolean equalsResult = str1.equals(str2);

        System.out.println("Using charAt(): " + charAtResult);
        System.out.println("Using equals(): " + equalsResult);

        if (charAtResult == equalsResult) {
            System.out.println("Both methods give same result.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}