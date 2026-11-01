package Lab4_5.Zadanie1;

class Point{
    double x;
    double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point other){
        double dx = other.x-x;
        double dy = other.y-y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}
