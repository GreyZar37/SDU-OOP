package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DataBase {

    public static void main(String[] args) {
        HashMap <String, Person> personMap = new HashMap<String, Person>(5);
        NondestructiveHashSet <String> set1 = new NondestructiveHashSet<>();
        NondestructiveHashSet <String> set2 = new NondestructiveHashSet<>();


        personMap.put("010101-0101", new Person("Johan ", "010101-0101", new Random().nextInt(12,80)));
        personMap.put("020202-0202", new Person("Peter", "020202-0202", new Random().nextInt(12,80)));
        personMap.put("030303-0303", new Person("Hans", "030303-0303", new Random().nextInt(12,80)));
        personMap.put("040404-0404", new Person("Jens", "040404-0404", new Random().nextInt(12,80)));
        personMap.put("050505-0505", new Person("Jesper", "050505-0505", new Random().nextInt(12,80)));

        System.out.println(personMap.get("040404-0404").toString());

        set1.add("010101-0101");
        set1.add("010101-0102");
        set1.add("010101-0106");

        set2.add("010101-0101");
        set2.add("010102-0102");
        set2.add("010102-0106");

        System.out.println("intersection");
        System.out.println(set1.intersection(set1, set2));

        System.out.println("union");
        System.out.println(set1.union(set1, set2));

        System.out.println("difference");
        System.out.println(set1.difference(set1, set2));





    }
}
