package Lab3;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = scan.nextLine();
        System.out.println("Результат: " + text.toUpperCase());
        scan.close();
    }
}