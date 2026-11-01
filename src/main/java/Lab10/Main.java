package Lab10;

public class Main {
    public static void main(String[] args){
        SoundMaker[] animals = {
                new Dog("Собакент", "Бульдог", 35, true),
                new Dog("Юшкевич", "Лабрадор", 30, false),
                new Dog("СтражевойПес", "Пудель", 40, true),
                new Cat("Ладеска", "Белый", 20, true),
                new Cat("КотКент", "Рыжий", 25, false)
        };
        for (SoundMaker animal : animals){
            animal.makeSound();
            System.out.println("Тип звука: "+animal.getSoundType());
            Movable movable = (Movable) animal;
            movable.move();
            System.out.println("Скорость: "+movable.getSpeed() + "км/ч");
            Feedable feedable = (Feedable) animal;
            System.out.println("Голоден: "+feedable.isHungry());
            feedable.feed();
            System.out.println();
        }
    }
}
