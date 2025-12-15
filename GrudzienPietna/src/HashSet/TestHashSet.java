package HashSet;

import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B");

        HashSet<String> unique = Utils4.findUniqueElements(list);
        System.out.println(unique);
    }
}
