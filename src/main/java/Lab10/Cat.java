package Lab10;

public class Cat implements SoundMaker, Movable, Feedable {
    private String name;
    private String color;
    private double speed;
    private boolean hungry;

    public Cat(String name, String color, double speed, boolean hungry){
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.hungry = hungry;
    }
    @Override
    public void makeSound(){
        System.out.println("Кошка "+name+" мяукает");
    }
    @Override
    public String getSoundType(){
        return "Мяуканье";
    }
    @Override
    public void move(){
        System.out.println("Кошка "+name + " бежит");
    }
    @Override
    public double getSpeed(){
        return speed;
    }
    @Override
    public void feed(){
        if(hungry){
            System.out.println("Кошка "+name + " поела");
            hungry = false;
        }else{
            System.out.println("Кошка "+name+ " не голодна");
        }
    }
    @Override
    public boolean isHungry(){
        return hungry;
    }


}
