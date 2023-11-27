package StorageSystemNew.presentation;
import StorageSystemNew.domain.Inventory;
import StorageSystemNew.domain.Item;
import StorageSystemNew.domain.NonFoodItem;

public class AddCLI {

    public static void main (String[] args) {

        Item i1 = new NonFoodItem("USB_Charger", 17.45,
                new String[] {"plastic", "stuff"});
        Inventory inventory = new Inventory();
        inventory.load("inventory.txt");
        inventory.addItem(i1);
        inventory.store("inventory.txt");
    }

}
