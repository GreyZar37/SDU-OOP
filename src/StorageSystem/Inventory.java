package StorageSystem;

public class Manager {
    public static void main(String[] args) {
        FoodItem[] items = new FoodItem[10];
        NonFoodItem[] items2 = new NonFoodItem[10];

        for (int i = 0; i < items.length; i++) {
            items[i] = new FoodItem("Item " + i, i * 10, new java.util.Date());
        }
        for (FoodItem item : items) {
            System.out.println(item);
        }

        for (int i = 0; i < items2.length; i++) {
            items2[i] = new NonFoodItem("Item " + i, i * 10, new String[]{"Material " + i, "Material " + (i + 1)});
        }
        for (NonFoodItem item : items2) {
            System.out.println(item);
        }
    }
}
