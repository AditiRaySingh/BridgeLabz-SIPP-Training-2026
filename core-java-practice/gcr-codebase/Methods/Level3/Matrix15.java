public class Matrix15 {

    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];

        return t;
    }

    public static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {

        int det = determinant2x2(m);

        return new double[][]{
                { m[1][1] / (double) det, -m[0][1] / (double) det },
                { -m[1][0] / (double) det, m[0][0] / (double) det }
        };
    }

    public static void main(String[] args) {

        int[][] m = {{1, 2}, {3, 4}};

        System.out.println("Determinant: " + determinant2x2(m));

        double[][] inv = inverse2x2(m);

        System.out.println("Inverse calculated.");
    }
}
