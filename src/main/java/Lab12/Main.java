package Lab12;

import java.util.Map;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Product> products = new LinkedHashMap<>();
        products.put("Ноутбук", new Electronics("Ноутбук", 1, 2750, 24));
        products.put("Смартфон", new Electronics("Телефон", 2, 2900, 12));
        products.put("Телевизор", new Electronics("Телевизор", 3, 3500, 36));

        products.put("Молоко", new Food("Молоко", 4, 3.5, "25.10.2026"));
        products.put("Хлеб", new Food("Хлеб", 5, 2.5, "22.10.2026"));
        products.put("Сыр", new Food("Сыр", 6, 15, "15.11.2026"));

        products.put("Куртка", new Clothings("Куртка", 7, 250, "L"));
        products.put("Футболка", new Clothings("Футболка", 8, 50, "M"));

        for (Map.Entry<String, Product> entry : products.entrySet()) {
            System.out.println("Ключ: " + entry.getKey());
            System.out.println("Значение: " + entry.getValue());
            System.out.println();
        }

    }
}
