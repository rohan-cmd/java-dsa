package CollectionFramework;
import java.util.*;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(29);
        adq.offer(58);
        adq.offerFirst(46);
        adq.offerLast(37);
        adq.offer(82);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        adq.poll();
        System.out.println("Poll : " + adq);

        adq.pollFirst();
        System.out.println("PollFirst : " + adq);

        adq.pollLast();
        System.out.println("PollLast : " + adq);
    }
}