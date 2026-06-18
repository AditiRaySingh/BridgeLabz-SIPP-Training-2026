import java.io.*;
import java.util.Scanner;

public class Expense_Logger {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("expenses.txt", true);

        System.out.print("Enter number of expenses: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter category: ");
            String category = sc.nextLine();

            System.out.print("Enter amount: ");
            int amount = sc.nextInt();
            sc.nextLine();

            fw.write(category + " - " + amount + "\n");
        }

        fw.close();

        System.out.println("Expenses saved successfully.");
    }
}