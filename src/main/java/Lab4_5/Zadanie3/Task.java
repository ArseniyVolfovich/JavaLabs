package Lab4_5.Zadanie3;

public class Task {
    public String name;
    Priority priority;
    public Task(String name, Priority priority){
        this.name = name;
        this.priority = priority;
    }
    public void info(){
        System.out.println(name + " - " + priority);
    }
}
