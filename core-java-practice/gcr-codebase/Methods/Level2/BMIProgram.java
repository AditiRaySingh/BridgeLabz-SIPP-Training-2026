import java.util.Scanner;

public class BMIProgram {

    static double calculateBMI(
            double weight,
            double heightCm) {

        double heightM = heightCm / 100.0;

        return weight /
                (heightM * heightM);
    }

    static String getStatus(double bmi) {

        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons =
                new double[10][3];

        String[] status =
                new String[10];

        for (int i = 0; i < 10; i++) {

            System.out.println(
                    "\nPerson " + (i + 1));

            System.out.print("Weight(kg): ");
            persons[i][0] =
                    sc.nextDouble();

            System.out.print("Height(cm): ");
            persons[i][1] =
                    sc.nextDouble();

            persons[i][2] =
                    calculateBMI(
                            persons[i][0],
                            persons[i][1]);

            status[i] =
                    getStatus(
                            persons[i][2]);
        }

        System.out.printf(
                "%-10s %-10s %-10s %-15s\n",
                "Weight",
                "Height",
                "BMI",
                "Status");

        for (int i = 0; i < 10; i++) {

            System.out.printf(
                    "%-10.2f %-10.2f %-10.2f %-15s\n",
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    status[i]);
        }

        sc.close();
    }
}