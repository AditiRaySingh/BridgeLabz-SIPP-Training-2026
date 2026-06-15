import java.util.Scanner;

public class ShortestLongestWord {

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

    static String[][] wordLengthData(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }

        return data;
    }

    static int[] shortestLongest(String[][] data) {

        int shortest = Integer.parseInt(data[0][1]);
        int longest = Integer.parseInt(data[0][1]);

        int shortIndex = 0;
        int longIndex = 0;

        for (int i = 1; i < data.length; i++) {

            int len = Integer.parseInt(data[i][1]);

            if (len < shortest) {
                shortest = len;
                shortIndex = i;
            }

            if (len > longest) {
                longest = len;
                longIndex = i;
            }
        }

        return new int[]{shortIndex, longIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = wordLengthData(words);

        int[] result = shortestLongest(data);

        System.out.println("Shortest Word : " + data[result[0]][0]);
        System.out.println("Longest Word  : " + data[result[1]][0]);

        sc.close();
    }
}