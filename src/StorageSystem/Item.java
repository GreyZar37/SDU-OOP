package StorageSystem;

public abstract class Item implements Expireable{
    String name;
    double price;

    Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
