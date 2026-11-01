package Lab8;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(String color, double x, double y, double width, double height){
        super(color, x ,y);
        this.width = width;
        this.height=height;
    }
    @Override
    public void draw(){
        System.out.println("Прямоугольник");
    }
    @Override
    public double calculate(){
        return width*height;
    }
    public boolean isSquare(){
        return width == height;
    }
}

