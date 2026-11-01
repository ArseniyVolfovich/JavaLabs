package Lab11;

public class Manager extends Employee {
    private int team;
    public Manager(String name, double salary, int experience, int team){
        super(name,salary,experience);
        this.team=team;
    }
    @Override
    public double calculateBonus(){
        return getSalary() *0.2;
    }
    public void conductMeeting(){
        System.out.println("Проходит собрание команды из "+team+" человек");
    }
    public void conductMeeting (int minutes){
        System.out.println("Проводит собрание "+minutes+" минут");
    }
}
