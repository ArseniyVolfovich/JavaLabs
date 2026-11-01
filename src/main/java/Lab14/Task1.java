package Lab14;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[]args) throws FileNotFoundException{
        File file = new File("book.txt");
        try(PrintWriter writer = new PrintWriter(file)){
            writer.println("Название: Игра престолов");
            writer.println("Автор: Джордж Р. Р. Мартин");
            writer.println("Жанр: Фэнтези, роман");
            writer.println("Описание: Песь льда и огня");
        }
        System.out.println("Имя файла: "+file.getName());
        System.out.println("Путь: "+file.getAbsolutePath());
        System.out.println("Размер: "+file.length() + "байт");
        System.out.println("Существует: "+file.exists());

        System.out.println("\nСодержимое файла: ");
        try(Scanner reader = new Scanner(file)){
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        }
    }
}

