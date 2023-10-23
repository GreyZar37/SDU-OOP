package StorageSystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Inventory {


    public static ArrayList<Item> items;

    Inventory(){
        items = new ArrayList<>();
    }

    public static void main(String[] args) {
       Inventory inventory = new Inventory();

         Item i1 = new FoodItem("Bread", 1.99, new Date(Calendar.YEAR, Calendar.NOVEMBER,Calendar.DATE));
         Item i3 = new FoodItem("Fish", 2.99, new Date(2023, Calendar.JULY,Calendar.DATE));

         Item i2 = new NonFoodItem("Chair", 99.99, new String[]{"Wood", "Metal"});
         Item[] items = new Item[]{i1,i3, i2};

         for(Item item : items){
             addItem(item);
         }
        printStatus();
         System.out.println("Removing expired items...");
            inventory.removeExpiredItems();
            System.out.println("Done!"+ "\n");
        printStatus();
    }

    public static void addItem(Item item){
        items.add(item);
    }
    public static void removeItem(Item item){
        items.remove(item);
    }
    public static double getInventory(){
        double total = 0.0;
        for(Item item : items){
            total += item.getPrice();
        }
        return  total;
    }
    public static void printInventory(){
        for(Item item : items){
            System.out.println(" - " + item.toString() + "\n");
        }
    }

    public static void printStatus(){
        printInventory();
        System.out.println("Total: " + getInventory() + "\n");

    }

    void removeExpiredItems(){

        ArrayList<Item> toRemove = new ArrayList<>();

        for(Item item : items){
            if(item.isExpired()){
                System.out.println("Removing " + item.getName() + "...");
                toRemove.add(item);
            }
        }
        items.removeAll(toRemove);
    }
}
