import java.util.Scanner;

public class FrequencyUnique {

    static char[] uniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < count; j++) {

                if (temp[j] == ch) {
                    unique = false;
                    break;
                }
            }

            if (unique)
                temp[count++] = ch;
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    static String[][] frequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        char[] unique = uniqueCharacters(text);

        String[][] result =
                new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] =
                    String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = frequency(text);

        System.out.printf("%-10s %-10s\n",
                "Char", "Frequency");

        for (String[] row : result)
            System.out.printf("%-10s %-10s\n",
                    row[0], row[1]);

        sc.close();
    }
}