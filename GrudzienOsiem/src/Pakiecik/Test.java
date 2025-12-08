package Pakiecik;

public class Test {

    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.set("123");
        System.out.println(b1.get());

        Box<Integer> b2 = new Box<>();
        b2.set(123);
        System.out.println(b1.get());
    }
}
