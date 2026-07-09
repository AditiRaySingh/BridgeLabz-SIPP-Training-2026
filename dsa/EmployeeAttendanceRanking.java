import java.util.Arrays;

public class EmployeeAttendanceRanking {

    public static int[] topKEmployees(int[] employeeIds, int[] attendance, int k) {

        int n = employeeIds.length;

        for (int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (attendance[j] > attendance[maxIndex]) {
                    maxIndex = j;
                } else if (attendance[j] == attendance[maxIndex]
                        && employeeIds[j] < employeeIds[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = attendance[i];
            attendance[i] = attendance[maxIndex];
            attendance[maxIndex] = temp;

            temp = employeeIds[i];
            employeeIds[i] = employeeIds[maxIndex];
            employeeIds[maxIndex] = temp;
        }

        return Arrays.copyOf(employeeIds, k);
    }

    public static void main(String[] args) {

        int[] employeeIds = {101, 102, 103, 104, 105};
        int[] attendance = {92, 85, 98, 92, 80};

        int k = 3;

        int[] result = topKEmployees(employeeIds, attendance, k);

        System.out.println(Arrays.toString(result));
    }
}