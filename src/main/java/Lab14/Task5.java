package Lab14;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task5 {
    public static void main(String[]args)throws FileNotFoundException{
        int[] numbers = {5, 12,15,7,20,33,40,51,55,62};
        try(PrintWriter writer = new PrintWriter("f")){
            for(int number : numbers){
                writer.println(number);
            }
        }
        int count =0;
        System.out.println("Числа из файла: ");
        try(Scanner reader = new Scanner(new File("f"))){
            while(reader.hasNextInt()){
                int number = reader.nextInt();
                System.out.println(number + " ");
                if(number %5 == 0){
                    count++;
                }
            }
        }
        System.out.println("\nКоличество чисел, кратных 5: "+count);
    }
}
