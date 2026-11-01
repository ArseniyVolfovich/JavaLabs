package Lab4_5.Zadanie2;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Employee[] employees ={
                new Employee("Арсений", 1750, "Организатор"),
                new Employee("Роман", 1500, "Ведущий"),
                new Employee("Александр", 2750, "Главный судья"),
                new Employee("Сергей", 2500, "Разработчик"),
                new Employee("Артемий", 2500, "Тестировщик"),
                new Employee("Илья", 2250, "Медиа")
        };
        Employee maxEmployee = employees[0];
        Employee minEmployee = employees[0];

        for(int i=0;i<employees.length;i++){
            if(employees[i].salary > maxEmployee.salary){
                maxEmployee = employees[i];
            }
            if(employees[i].salary<minEmployee.salary){
                minEmployee = employees[i];
            }
        }
        System.out.println("Сотрудник с максимальной зп: ");
        System.out.println("Имя: "+maxEmployee.name + " должность: "+maxEmployee.position + " зарплата: "+maxEmployee.salary);
        System.out.println();
        System.out.println("Сотрудник с минимальной зп: ");
        System.out.print("Имя: "+minEmployee.name + " должность: "+minEmployee.position + " зарплата: "+ minEmployee.salary);
        System.out.println();
        System.out.println(maxEmployee);
    }
}
