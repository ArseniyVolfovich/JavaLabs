package Lab7;

public class Product {
    public String name;
    public double price;
    public int quantity;
    static int totalProducts = 0;
    static double totalValue = 0;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        totalProducts += quantity;
        totalValue += price * quantity;
    }
    public static double getAveragePrice(){
        return totalValue/totalProducts;
    }

    public static void printProducts(Product product){
        System.out.println("Название: "+product.name);
        System.out.println("Цена: "+product.price);
        System.out.println("Количество: "+product.quantity);
        System.out.println("Общее кол-во продуктов: "+totalProducts);
        System.out.println("Общее количество: "+totalValue);
        System.out.println();
    }

    public void info(){
        System.out.println("Кол-во продуктов: "+totalProducts);
        System.out.println("Общее количество: "+totalValue);

    }
}
