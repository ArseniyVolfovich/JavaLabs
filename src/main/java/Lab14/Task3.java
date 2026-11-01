package Lab14;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
public class Task3 {
    public static void main(String[]args)throws FileNotFoundException{
        Random random = new Random();
        System.out.println("Случайные числа: ");
        try(PrintWriter writer = new PrintWriter("f")){
            for(int i=0;i<20;i++){
                int number= random.nextInt(201)-100;
                writer.println(number);
                System.out.println(number + "");
            }
        }
        try(
                Scanner reader = new Scanner(new File("f"));
                PrintWriter writerG = new PrintWriter("g");
                PrintWriter writerH = new PrintWriter("h")
                ){
            while(reader.hasNextInt()){
                int number = reader.nextInt();
                if(Math.abs(number) >=10 && Math.abs(number)<=99){
                    writerG.println(number);
                }else{
                    writerH.println(number);
                }
            }
        }
        System.out.println("\nДвухзначные числа записаны в файл g");
        System.out.println("Остальные числа записаны в файл h");
    }
}
