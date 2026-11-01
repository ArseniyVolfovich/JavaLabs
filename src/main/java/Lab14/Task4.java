package Lab14;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[]args)throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
        try(PrintWriter writer = new PrintWriter("temperatures.txt")){
            for(int i=0;i<14;i++){
                System.out.println("Введите температуру "+(i+1)+": ");
                String input = scanner.nextLine().replace(',','.');
                double temperature = Double.parseDouble(input);
                writer.println(temperature);
            }
        }
        double sum=0;
        int count=0;
        try(Scanner reader = new Scanner(new File("temperatures.txt"))){
            reader.useLocale(Locale.US);
            while(reader.hasNextDouble()){
                double temperature = reader.nextDouble();
                sum += temperature;
                count++;
            }
        }
        double average = sum/count;
        System.out.printf("Средняя температура: %.2f%n", average);
    }
}
