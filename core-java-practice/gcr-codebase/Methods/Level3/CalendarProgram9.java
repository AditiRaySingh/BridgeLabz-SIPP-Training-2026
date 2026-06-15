import java.util.Scanner;

public class CalendarProgram9 {

    static String[] months = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    static int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDay(int month, int year) {
        int d = 1;
        int m = (month < 3) ? month + 12 : month;
        int y = (month < 3) ? year - 1 : year;

        return (d + (13 * (m + 1)) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
    }

    public static void printCalendar(int month, int year) {

        int firstDay = getFirstDay(month, year);
        int numDays = days[month - 1];

        if (month == 2 && isLeap(year)) numDays = 29;

        System.out.println("\n" + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= numDays; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        int m = sc.nextInt();

        System.out.print("Enter year: ");
        int y = sc.nextInt();

        printCalendar(m, y);
    }
}