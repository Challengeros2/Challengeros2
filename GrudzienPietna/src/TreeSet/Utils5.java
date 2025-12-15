package TreeSet;

import java.util.List;
import java.util.TreeSet;

public class Utils5 {

    public static <T> List<T> removeMinMax(TreeSet<T> set) {
        if (set == null || set.size() < 2) {
            return List.of(null, null);
        }

        T min = set.pollFirst(); // usuwa najmniejszy
        T max = set.pollLast();  // usuwa największy

        return List.of(min, max);
    }
}
