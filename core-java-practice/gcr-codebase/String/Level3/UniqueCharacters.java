import java.util.Scanner;

public class UniqueCharacters {

    static int findLength(String str) {

        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    static char[] uniqueCharacters(String text) {

        int len = findLength(text);

        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);

        System.out.println("Unique Characters:");

        for (char c : unique)
            System.out.print(c + " ");

        sc.close();
    }
}