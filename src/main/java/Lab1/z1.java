package Lab1;
import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner proizved = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = proizved.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = proizved.nextInt();
        int result = num1 * num2;
        System.out.println("Результат: " + result);
        proizved.close();
    }
}