package Lab8;

public class Main {
    public static void main(String[]args){
        Shape[] shapes = {
                new Circle("Красный", 2,3,5),
                new Circle ("Синий", 4,6,3),
                new Circle("Черный", 1,2,7),
                new Rectangle ("Желтый", 3,4,5,5),
                new Rectangle("Белый", 5,6,8,4)
        };
        for (Shape shape: shapes){
            System.out.println("Цвет: "+shape.getColor());
            System.out.println("Координата x: "+shape.getX());
            System.out.println("Координата y: "+shape.getY());

            shape.draw();
            System.out.println("Площадь: "+shape.calculate());
            if(shape instanceof Circle){
                Circle circle = (Circle) shape;
                System.out.println("Диаметр: "+circle.getdiameter());
            }
            if(shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Является квадратом: "+rectangle.isSquare());
            }
            System.out.println();
        }
    }
}
