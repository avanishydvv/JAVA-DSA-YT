package JAVACOLLECTIONFRAMEWORK;

import javax.management.Query;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        // default behaviou -> Integers -> less value -> high priority -> minheap
        // maxheap -> integers -> high value -> hig priority
        // pq -> strings -> comparator
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
















    }
}
