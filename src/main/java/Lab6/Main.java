package Lab6;

public class Main {
    public static void main (String[] args){
        Fraction fraction1 = new Fraction(1,2);
        Fraction fraction2 = new Fraction(3,4);
        System.out.println("Первая дробь: "+fraction1);
        System.out.println("Десятичное значение: "+fraction1.toDecimal());
        System.out.println();
        System.out.println("Вторая дробь: "+fraction2);
        System.out.println("Десятичное значение: "+fraction2.toDecimal());
    }
}
