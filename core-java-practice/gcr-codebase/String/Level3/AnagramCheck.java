import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int[] freq = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {

            if (freq[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Text: ");
        String s1 = sc.nextLine();

        System.out.print("Enter Second Text: ");
        String s2 = sc.nextLine();

        System.out.println("Anagram : "
                + isAnagram(s1, s2));

        sc.close();
    }
}