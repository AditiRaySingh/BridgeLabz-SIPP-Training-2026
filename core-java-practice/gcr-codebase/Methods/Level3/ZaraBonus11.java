import java.util.Random;

public class ZaraBonus11 {

    public static int[][] generateData(int n) {
        Random r = new Random();
        int[][] data = new int[n][2];

        for (int i = 0; i < n; i++) {
            data[i][0] = 20000 + r.nextInt(80000); // salary
            data[i][1] = 1 + r.nextInt(10);        // years
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][3];

        for (int i = 0; i < data.length; i++) {

            int salary = data[i][0];
            int years = data[i][1];

            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }

    public static void display(double[][] res) {

        double oldSum = 0, newSum = 0, bonusSum = 0;

        System.out.println("Old\tNew\tBonus");

        for (double[] r : res) {
            System.out.println(r[0] + "\t" + r[1] + "\t" + r[2]);

            oldSum += r[0];
            newSum += r[1];
            bonusSum += r[2];
        }

        System.out.println("\nTotal Old Salary: " + oldSum);
        System.out.println("Total New Salary: " + newSum);
        System.out.println("Total Bonus: " + bonusSum);
    }

    public static void main(String[] args) {
        int[][] data = generateData(10);
        double[][] result = calculateBonus(data);
        display(result);
    }
}