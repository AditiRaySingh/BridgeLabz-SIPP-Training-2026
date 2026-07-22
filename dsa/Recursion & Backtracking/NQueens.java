import java.util.*;

public class NQueens {

    public static List<List<String>> placeSensors(int n) {
        List<List<String>> result = new ArrayList<>();

        // sensorCol[row] = column where sensor (queen) is placed
        int[] sensorCol = new int[n];

        backtrack(n, 0, sensorCol, result);

        return result;
    }

    private static void backtrack(int n, int row,
                                  int[] sensorCol,
                                  List<List<String>> result) {

        // All rows filled
        if (row == n) {
            result.add(buildGrid(n, sensorCol));
            return;
        }

        // Try placing sensor in every column
        for (int col = 0; col < n; col++) {

            if (isSafe(row, col, sensorCol)) {

                // Choose
                sensorCol[row] = col;

                // Explore next row
                backtrack(n, row + 1, sensorCol, result);

                // No explicit undo needed
                // sensorCol[row] will be overwritten
            }
        }
    }

    private static boolean isSafe(int row, int col, int[] sensorCol) {

        for (int r = 0; r < row; r++) {

            // Same column
            if (sensorCol[r] == col)
                return false;

            // Same diagonal
            if (Math.abs(sensorCol[r] - col) == Math.abs(r - row))
                return false;
        }

        return true;
    }

    private static List<String> buildGrid(int n, int[] sensorCol) {

        List<String> board = new ArrayList<>();

        for (int r = 0; r < n; r++) {

            char[] row = new char[n];
            Arrays.fill(row, '.');

            row[sensorCol[r]] = 'Q';

            board.add(new String(row));
        }

        return board;
    }

    public static void main(String[] args) {

        int n = 4;

        List<List<String>> solutions = placeSensors(n);

        System.out.println("Total Solutions: " + solutions.size());

        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}