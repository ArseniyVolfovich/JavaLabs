package Lab3;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String text = scan.nextLine();
        String[] words = text.split(" ");
        String longest = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println("Самое длинное слово: " + longest);
        scan.close();
    }
}