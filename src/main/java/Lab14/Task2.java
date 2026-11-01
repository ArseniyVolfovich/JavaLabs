package Lab14;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task2 {
    public static void main(String[]args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        try(PrintWriter writer = new PrintWriter("f")){
            for(int i=0;i<10;i++){
                System.out.println("Введите число "+(i+1)+ ": ");
                int number = scanner.nextInt();
                writer.println(number);
            }
        }
        BigInteger product = BigInteger.ONE;
        System.out.println("\nЧисла из файла: ");
        try(Scanner reader = new Scanner(new File("f"))){
            while(reader.hasNextInt()){
                int number = reader.nextInt();
                System.out.println(number + " ");
                product = product.multiply(BigInteger.valueOf(number));
            }
        }
        System.out.println("\nПроизведение: "+product);
    }
}
