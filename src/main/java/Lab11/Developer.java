package Lab11;

public class Developer extends Employee {
    private String language;
    public Developer(String name, double salary, int experience, String language){
        super(name,salary,experience);
        this.language=language;
    }
    @Override
    public double calculateBonus(){
        return getSalary() *0.15;
    }
    public void writeCode(){
        System.out.println("Пишет код на "+language);
    }
    public void writeCode(String task){
        System.out.println("Пишет код для задачи: "+task);
    }
}

