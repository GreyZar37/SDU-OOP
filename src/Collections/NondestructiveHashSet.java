package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class NondestructiveHashSet<T> extends HashSet<T> implements NondestructiveSet<T> {

    @Override
    public NondestructiveSet<T> intersection(NondestructiveSet<T> a, NondestructiveSet<T> b) {
        NondestructiveHashSet<T> result = new NondestructiveHashSet<>();
        result.addAll((Collection)a);
        result.retainAll((Collection)b);


        return result;
    }

    @Override
    public NondestructiveSet<T> union(NondestructiveSet<T> a, NondestructiveSet<T> b) {
        NondestructiveHashSet<T> result = new NondestructiveHashSet<>();
        result.addAll((Collection)a);
        result.addAll((Collection)b);

        return result;
    }

    @Override
    public NondestructiveSet<T> difference(NondestructiveSet<T> a, NondestructiveSet<T> b) {
        NondestructiveHashSet<T> result = new NondestructiveHashSet<>();
        result.addAll((Collection)a);
        result.removeAll((Collection)b);

        return result;
    }
}