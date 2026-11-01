package Lab9;

public class Developer extends Employee {
    private String language;
    public Developer(String name, double salary, int experience, String language){
        super(name,salary,experience);
        this.language=language;
    }
    @Override
    public void work(){
        System.out.println("Пишет код");
    }
    @Override
    public double bonus(){
        return getSalary()*0.15;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Язык программирования: "+language);
    }
}
