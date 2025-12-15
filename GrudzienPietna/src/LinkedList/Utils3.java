package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Utils3 {

    public static <T> boolean isPalindrome(LinkedList<T> list) {
        if (list == null || list.size() <= 1) {
            return true;
        }

        Iterator<T> slow = list.iterator();
        Iterator<T> fast = list.iterator();
        Stack<T> stack = new Stack<>();

        // przechodzimy do połowy listy
        while (fast.hasNext()) {
            fast.next();
            if (fast.hasNext()) {
                stack.push(slow.next());
                fast.next();
            }
        }

        // jeśli liczba elementów nieparzysta – pomijamy środkowy
        if (list.size() % 2 != 0) {
            slow.next();
        }

        // porównanie drugiej połowy z pierwszą (ze stosu)
        while (slow.hasNext()) {
            if (!slow.next().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }
}
