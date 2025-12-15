package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list =
                new ArrayList<>(Arrays.asList("A", "B", "A", "C", "B"));

        ArrayList<String> unique = Utils2.removeDuplicates(list);
        System.out.println(unique);
    }
}
