package Pakiecik3;

public class Test3 {
    public static void main(String[] args) {
        Counter<Integer> c = new Counter<>();
        System.out.println(c.getCount());
        c.add(1);
        System.out.println(c.getCount());
        c.add(2);
        System.out.println(c.getCount());
        c.add(3);
        System.out.println(c.getCount());
    }
}
