package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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

class NondestructiveHashSet<T> extends HashSet<T> implements NondestructiveSet<T> {

    @Override
    public NondestructiveSet<T> intersection(NondestructiveSet<T> a, NondestructiveSet<T> b) {
        NondestructiveHashSet<T> result = new NondestructiveHashSet<>();
        result.addAll((Collection) a);
        result.retainAll((Collection) b);


        return result;
    }

    @Override
    public NondestructiveSet<T> union(NondestructiveSet<T> a, NondestructiveSet<T> b) {
        NondestructiveHashSet<T> result = new NondestructiveHashSet<>();
        result.addAll((Collection) a);
        result.addAll((Collection) b);

        return result;
    }

    @Override
    public NondestructiveSet<T> difference(NondestructiveSet<T> a, NondestructiveSet<T> b) {
        NondestructiveHashSet<T> result = new NondestructiveHashSet<>();
        result.addAll((Collection) a);
        result.removeAll((Collection) b);

        return result;
    }
}
    interface NondestructiveSet <T> {

        Collections.NondestructiveSet<T> intersection(Collections.NondestructiveSet<T> a, Collections.NondestructiveSet<T> b);
        Collections.NondestructiveSet<T> union(Collections.NondestructiveSet<T> a, Collections.NondestructiveSet<T> b);
        Collections.NondestructiveSet<T> difference(Collections.NondestructiveSet<T> a, Collections.NondestructiveSet<T> b);



    }
 class Person {
    public String name, cpr;
    public int age;

    Person(String name, String cpr, int age){
        this.name = name;
        this.cpr = cpr;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getCpr(){
        return cpr;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String  toString(){
        return ("Name: " + getName() + "\nCPR: " + getCpr() + "\nAge: " + getAge());
    }
}
