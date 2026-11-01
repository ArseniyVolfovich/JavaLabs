package Lab8;

public class Circle extends Shape {
    private double radius;
    public Circle(String color, double x, double y, double radius){
        super(color,x,y);
        this.radius = radius;
    }
    @Override
    public void draw(){
        System.out.println("Круг");
    }
    @Override
    public double calculate(){
        return Math.PI * radius * radius;
    }
    public double getdiameter(){
        return radius*2;
    }

}
