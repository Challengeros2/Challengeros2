package Collection;

import java.util.Arrays;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B");
        Utils.printUnique(list);
    }
}
