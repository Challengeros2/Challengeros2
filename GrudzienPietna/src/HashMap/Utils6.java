package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Utils6 {

    public static <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map) {
        HashMap<V, Integer> result = new HashMap<>();

        for (V value : map.values()) {
            result.put(value, result.getOrDefault(value, 0) + 1);
        }

        return result;
    }
}