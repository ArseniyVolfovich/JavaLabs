package Lab12;

public class Food extends Product {
    private String expirationDate;
    public Food(String name, int id,double price, String expirationDate){
        super(name,id,price);
        this.expirationDate=expirationDate;
    }
    @Override
    public String toString(){
        return super.toString() + " Срок годности: "+expirationDate;
    }
}
