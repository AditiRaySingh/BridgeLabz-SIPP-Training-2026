import java.util.Scanner;

public class BMICalculator {

    static String[] calculateBMI(double weight, double heightCm) {

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }

    static String[][] generateReport(double[][] data) {

        String[][] report = new String[10][4];

        for (int i = 0; i < 10; i++) {

            String[] bmiData =
                    calculateBMI(data[i][0], data[i][1]);

            report[i][0] = String.valueOf(data[i][0]);
            report[i][1] = String.valueOf(data[i][1]);
            report[i][2] = bmiData[0];
            report[i][3] = bmiData[1];
        }

        return report;
    }

    static void display(String[][] report) {

        System.out.printf("%-10s %-10s %-10s %-15s\n",
                "Weight", "Height", "BMI", "Status");

        for (String[] row : report) {
            System.out.printf("%-10s %-10s %-10s %-15s\n",
                    row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.println("Person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] report = generateReport(persons);

        display(report);

        sc.close();
    }
}