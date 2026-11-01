package Lab2
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задания: ");
        System.out.println("1 Задание");
        System.out.println("2 Задание");
        int zadanie = scan.nextInt();
        switch (zadanie) {
            case 1:
                System.out.println("Введите размер массива");
                int n = scan.nextInt();
                int[] numbers = new int[n];
                int sum = 0;
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("Введите элемент: " + i);
                    numbers[i] = scan.nextInt();
                    sum += numbers[i];
                }
                double avg = (double) sum / numbers.length;
                System.out.println("Средняя: " + avg);
                break;
            case 2:
                Random rand = new Random();
                int[][] arr = new int[5][5];
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = rand.nextInt(100);
                    }
                }
                int max = Integer.MIN_VALUE;
                System.out.println("Матрица: ");
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + "\t");
                        if (arr[i][j] > max) {
                            max = arr[i][j];
                        }
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("Максимальный элемент: " + max);
                break;
            default:
                System.out.println("Нету такого задания");
        }
        scan.close();
    }
}
