package Lab10;

public class Dog implements SoundMaker, Movable, Feedable {
    private String name;
    private String breed;
    private double speed;
    private boolean hungry;
    public Dog(String name, String breed, double speed, boolean hungry){
        this.name = name;
        this.breed = breed;
        this.speed = speed;
        this.hungry = hungry;
    }
    @Override
    public void makeSound(){
        System.out.println("Собака "+name + " гавкает");
    }
    @Override
    public String getSoundType(){
        return "Лай";
    }
    @Override
    public void move(){
        System.out.println("Собака "+ name + " бежит");
    }
    @Override
    public double getSpeed(){
        return speed;
    }
    @Override
    public void feed(){
        if(hungry){
            System.out.println("Собака "+name + " поела");
            hungry = false;
        }else{
            System.out.println("Собака "+name+" не голодна");
        }
    }
    @Override
    public boolean isHungry(){
        return hungry;
    }
}
