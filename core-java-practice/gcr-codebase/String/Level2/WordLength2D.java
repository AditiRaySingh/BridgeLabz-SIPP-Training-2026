import java.util.Scanner;

public class WordLength2D {

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

        int words = 1;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ')
                words++;
        }

        String[] result = new String[words];

        String temp = "";
        int index = 0;

        for (int i = 0; i < findLength(text); i++) {

            if (text.charAt(i) == ' ') {
                result[index++] = temp;
                temp = "";
            } else {
                temp += text.charAt(i);
            }
        }

        result[index] = temp;

        return result;
    }

    static String[][] getWordAndLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    static void display(String[][] data) {

        System.out.printf("%-20s %-10s\n", "Word", "Length");
        System.out.println("------------------------------");

        for (int i = 0; i < data.length; i++) {

            int len = Integer.parseInt(data[i][1]);

            System.out.printf("%-20s %-10d\n",
                    data[i][0], len);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = getWordAndLength(words);

        display(result);

        sc.close();
    }
}