import java.util.Scanner;

public class SplitText {

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

    static String[] splitWords(String text) {

        int len = findLength(text);

        int words = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];

        String word = "";
        int index = 0;

        for (int i = 0; i < len; i++) {

            if (text.charAt(i) == ' ') {
                result[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }

        result[index] = word;

        return result;
    }

    static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] userSplit = splitWords(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(userSplit, builtInSplit);

        System.out.println("\nWords using User Method:");
        for (String word : userSplit)
            System.out.println(word);

        System.out.println("\nComparison Result: " + result);

        sc.close();
    }
}