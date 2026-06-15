public class NumberChecker3 {

    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static boolean isHarshad(int n, int[] digits) {
        return n % sumDigits(digits) == 0;
    }

    public static int[][] frequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        int n = 21;
        int[] digits = getDigits(n);

        System.out.println("Harshad: " + isHarshad(n, digits));

        int[][] freq = frequency(digits);

        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(i + " -> " + freq[i][1]);
        }
    }
}