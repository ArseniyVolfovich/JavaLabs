package Lab7;

public class Main {
    public static void main(String[]args){
        Product product1 = new Product("Ноутбук", 2750,2);
        Product product2 = new Product("Iphone 16 Pro", 2900,5);
        Product product3 = new Product("MacBook", 3600,3);
        Product product4 = new Product("Samsung Galaxy S26", 3700,10);

        System.out.println("Общее количество товаров: "+Product.totalProducts);
        System.out.println("Общая стоимость: "+Product.totalValue);
        System.out.println("Средняя цена: "+Product.getAveragePrice());
    }
}
