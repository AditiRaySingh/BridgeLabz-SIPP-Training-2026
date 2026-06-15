import java.util.Scanner;

public class TrimString {

    static int[] trimIndexes(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (str.charAt(start) == ' ')
            start++;

        while (str.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    static String substringMethod(String str, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++)
            result += str.charAt(i);

        return result;
    }

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

        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = trimIndexes(text);

        String userTrim =
                substringMethod(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();

        System.out.println("User Trim    : " + userTrim);
        System.out.println("Built-in Trim: " + builtInTrim);

        System.out.println("Match : "
                + compareStrings(userTrim, builtInTrim));

        sc.close();
    }
}