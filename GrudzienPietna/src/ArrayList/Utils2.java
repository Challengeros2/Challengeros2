package ArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Utils2 {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}

