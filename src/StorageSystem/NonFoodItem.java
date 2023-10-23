package StorageSystem;
import java.util.ArrayList;

import java.util.Arrays;

public class NonFoodItem extends Item {
    ArrayList<String> materials;

    NonFoodItem(String name, double price, ArrayList<String> materials){
        super(name, price);
        this.materials = materials;
    }
    NonFoodItem(String name, double price, String[] materials){
        super(name, price);
        this.materials = new ArrayList<String>(Arrays.asList(materials));
    }
    public ArrayList<String> getMaterials(){
        return materials;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nPrice: " + getPrice() + "\nMaterials: " + getMaterials();
    }

    @Override
    public boolean isExpired(){
        return false;
    }
}
