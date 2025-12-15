package TreeMap;

import java.util.TreeMap;

public class Utils7 {

    public static <K> double calculateAverageValue(TreeMap<K, Double> map) {
        double sum = 0.0;

        for (Double value : map.values()) {
            sum += value;
        }

        return sum / map.size();
    }
}
