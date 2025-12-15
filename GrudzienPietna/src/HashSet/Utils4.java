package HashSet;

import java.util.HashSet;
import java.util.List;

public class Utils4 {

    public static <T> HashSet<T> findUniqueElements(List<T> list) {
        return new HashSet<>(list);
    }
}
