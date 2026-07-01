import java.util.*;

public class AttendanceTracker {
    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public static void markAttendance(String subject, String student) {
        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println("Duplicate attendance not allowed.");
        }
    }

    public static void displayAttendance() {
        for (String subject : attendance.keySet()) {
            System.out.println("Subject: " + subject);
            ArrayList<String> students = attendance.get(subject);

            for (String s : students) {
                System.out.println(s);
            }

            System.out.println("Total Students: " + students.size());
        }
    }

    public static void main(String[] args) {
        markAttendance("Java", "Aditi");
        markAttendance("Java", "Rahul");
        markAttendance("Java", "Aditi");

        markAttendance("DBMS", "Rohan");

        displayAttendance();
    }
}