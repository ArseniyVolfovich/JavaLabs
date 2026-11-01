package Lab1;
import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задания: ");
        System.out.println("1 задание");
        System.out.println("2 задание");
        System.out.println("3 задание");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Введите первое число: ");
                int num1 = scan.nextInt();
                System.out.print("Введите второе число: ");
                int num2 = scan.nextInt();
                int result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case 2:
                System.out.print("Введите первое число: ");
                int a = scan.nextInt();
                System.out.print("Введите второе число: ");
                int b = scan.nextInt();
                if (a > b) {
                    System.out.println("Число " + a + " больше");
                } else if (a < b) {
                    System.out.println("Число " + b + " больше");
                } else {
                    System.out.println("Числа равны");
                }
                break;
            case 3:
//                int i = 99;
//                while (i >= 1) {
//                    if (i % 2 != 0) {
//                        System.out.println("Нечетные числа: " + i);
//                    }
//                    i--;
//                }
                for (int i = 99; i >= 1; i--) {
                    if (i % 2 != 0) {
                        System.out.println("Нечетные числа: " + i);
                    }
                }
                break;
            default:
                System.out.println("Нету такого задания");
        }
        scan.close();
    }
}
