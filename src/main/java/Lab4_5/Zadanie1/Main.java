package Lab4_5.Zadanie1;
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point (2,3);
        Point point2 = new Point (7,8);
        double distance = point1.distanceTo(point2);
        System.out.println("Расстояние между точками: "+distance);
    }
}
