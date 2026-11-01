package Lab3;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Zadanie4 {
    public static void main(String[] args) {
        String text = "Versions: Java 5, Java  6, Java 7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("Java\\s+\\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
