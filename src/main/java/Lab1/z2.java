package Lab1;
import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner sravnenie = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sravnenie.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sravnenie.nextInt();
        if (num1 > num2) {
            System.out.println("Число: " + num1 + " больше");
        } else if (num2 > num1) {
            System.out.println("Число: " + num2 + " больше");
        } else {
            System.out.println("Числа равны");
            sravnenie.close();
        }
    }
}
