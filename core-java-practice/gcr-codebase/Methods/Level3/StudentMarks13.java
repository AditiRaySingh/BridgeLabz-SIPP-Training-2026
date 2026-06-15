import java.util.Random;

public class StudentMarks13 {

    public static int[][] generateMarks(int students) {
        Random r = new Random();
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 40 + r.nextInt(61);
            }
        }
        return marks;
    }

    public static double[][] calculate(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }

            double avg = sum / 3.0;
            double percent = (sum / 300.0) * 100;

            result[i][0] = sum;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static void display(int[][] marks, double[][] res) {

        System.out.println("Phy Chem Math | Total Avg %");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    marks[i][0] + " " + marks[i][1] + " " + marks[i][2]
                            + " | " + res[i][0] + " " + res[i][1] + " " + res[i][2]
            );
        }
    }

    public static void main(String[] args) {

        int[][] marks = generateMarks(5);
        double[][] res = calculate(marks);

        display(marks, res);
    }
}