import java.util.Scanner;

public class StudentVoteChecker {

    public boolean canStudentVote(int age) {

        if (age < 0)
            return false;

        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentVoteChecker obj =
                new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter Age of Student "
                    + (i + 1) + ": ");

            ages[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility");

        for (int i = 0; i < ages.length; i++) {

            System.out.println("Student "
                    + (i + 1)
                    + " -> "
                    + obj.canStudentVote(ages[i]));
        }

        sc.close();
    }
}