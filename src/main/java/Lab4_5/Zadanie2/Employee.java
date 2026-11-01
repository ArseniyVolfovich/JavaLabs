package Lab4_5.Zadanie2;

class Employee {
    public String name;
    public double salary;
    public String position;

    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }
    public String toString() {
        return "Имя: " + name +
                ", должность: " + position +
                ", зарплата: " + salary;
    }
}