package CollectionFramework;
import java.util.*;

public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(5);
        que.offer(10);
        que.offer(15);
        que.offer(20);

        System.out.println(que);

        System.out.println(que.peek());

        que.poll();

        System.out.println(que);

        for(Integer i : que){
            System.out.println(i);
        }
    }
}