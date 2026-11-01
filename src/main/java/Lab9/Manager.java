package Lab9;

public class Manager extends Employee {
    private int team;
    public Manager(String name, double salary, int experience, int team){
        super(name,salary,experience);
        this.team=team;
    }
    @Override
    public void work(){
        System.out.println("Управление командой");
    }
    @Override
    public double bonus(){
        return getSalary()*0.2;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Размер команды: "+team);
    }
}
