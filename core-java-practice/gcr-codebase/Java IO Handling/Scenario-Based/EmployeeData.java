import java.io.*;
import java.util.Scanner;

class Employee implements Serializable {
    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println(employeeId + " " + name + " " + department + " " + salary);
    }
}

public class EmployeeData {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, dept, salary);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.txt"));
        out.writeObject(emp);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
        Employee e = (Employee) in.readObject();

        System.out.println("Recovered Employee Data:");
        e.display();

        in.close();
    }
}