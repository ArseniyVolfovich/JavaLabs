package Lab12;

public class Clothings extends Product {
    private String size;
    public Clothings(String name, int id, double price, String size){
        super(name,id,price);
        this.size=size;
    }
    @Override
    public String toString(){
        return super.toString() + "Размер: "+size;
    }
}
