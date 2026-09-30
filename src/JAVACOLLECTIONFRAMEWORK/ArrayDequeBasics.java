package JAVACOLLECTIONFRAMEWORK;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasics {
    public static void main(String[] args) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offerFirst(50);

        System.out.println(q);


    }
}
