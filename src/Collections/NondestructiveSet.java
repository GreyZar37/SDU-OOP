package Collections;
public interface NondestructiveSet <T> {

    NondestructiveSet<T> intersection(NondestructiveSet<T> a, NondestructiveSet<T> b);
    NondestructiveSet<T> union(NondestructiveSet<T> a, NondestructiveSet<T> b);
    NondestructiveSet<T> difference(NondestructiveSet<T> a, NondestructiveSet<T> b);



}

