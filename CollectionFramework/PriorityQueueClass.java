package CollectionFramework;
import java.util.*;

public class PriorityQueueClass {
    public static void main(String[] args) {
        // Queue<Integer> pq = new PriorityQueue<>(); // MinHeap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // MaxHeap

        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(40);
        pq.offer(20);

        System.out.println(pq);

        System.out.println(pq.peek());

        pq.poll();

        System.out.println(pq);
    }
}
