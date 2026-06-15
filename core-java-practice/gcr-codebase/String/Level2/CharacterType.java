import java.util.Scanner;

public class CharacterType {

    static String checkCharacter(char ch) {

        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u')
                return "Vowel";

            return "Consonant";
        }

        return "Not a Letter";
    }

    static String[][] classify(String text) {

        String[][] data = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {

            data[i][0] = String.valueOf(text.charAt(i));
            data[i][1] = checkCharacter(text.charAt(i));
        }

        return data;
    }

    static void display(String[][] data) {

        System.out.printf("%-10s %-15s\n", "Character", "Type");

        for (int i = 0; i < data.length; i++) {

            System.out.printf("%-10s %-15s\n",
                    data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        String[][] result = classify(text);

        display(result);

        sc.close();
    }
}