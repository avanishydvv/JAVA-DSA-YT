package JAVACOLLECTIONFRAMEWORK;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QUEUEBASICS {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(10);   // preffered it do not show exception
        q.offer(20);
        q.offer(30);

        //q.add(40);
        // yaha add agar execute ho gaya to thik hai agar
        // nahi hua to exception throw karega

        System.out.println(q);

        System.out.println("Removing :"+q.poll());

        System.out.println(q);

        System.out.println("Peeking :"+q.peek());





    }
}
