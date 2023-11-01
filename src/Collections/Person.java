package Collections;
public class Person {
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


