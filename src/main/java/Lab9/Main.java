package Lab9;

public class Main {
    public static void main(String[]args){
        Employee[] employees = {
                new Manager("Александр", 3000,5,10),
                new Manager("Роман", 2500,3,6),
                new Developer("Арсений", 2000,2,"Java"),
                new Developer("Сергей", 2250,3,"1C"),
                new Developer("Илья",2600,4,"C#")
        };
        for(Employee employee:employees){
            employee.info();
            employee.work();
            System.out.println("Бонус: "+employee.bonus());
            System.out.println();
        }
    }
}
