package Lab3
import java.util.Scanner;

class Employee {
    String fullname;
    double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-15s %10s%n", "Сотрудник", "Зарплата");
        for (Employee employee : employees) {
            System.out.printf("%-15s %10.2f%n", employee.fullname, employee.salary);
        }

    }
}

public class Zadanie3 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Вольфович", 1500.50),
                new Employee("Черников", 3750.12),
                new Employee("Шангинов", 4574.1567),
                new Employee("Юшкевич", 5700.43)
        };
        Report.generateReport(employees);
    }
}