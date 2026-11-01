package Lab11;

public class Main {
    public static void main(String[]args){
        Employee employee = new Employee("Роман", 2500,2);
        Manager manager = new Manager("Александр", 3500,5,8);
        Developer developer = new Developer ("Арсений", 500,2,"Java");
        System.out.println();

        employee.work();
        employee.work(8);
        employee.work("RaceLane");

        manager.conductMeeting();
        manager.conductMeeting(45);

        developer.writeCode();
        developer.writeCode("Регистрация");

        System.out.println();

        Employee[] employees = {
                employee,
                manager,
                developer
        };
        for(Employee emp: employees){
            System.out.println("Имя: "+emp.getName());
            System.out.println("Зарплата: "+emp.getSalary());
            System.out.println("Опыт: "+emp.getExperience());
            System.out.println("Бонус: "+emp.calculateBonus());
            System.out.println();
        }
    }
}
