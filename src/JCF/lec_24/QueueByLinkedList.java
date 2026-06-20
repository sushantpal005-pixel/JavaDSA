package JCF.lec_24;

import java.util.LinkedList;
import java.util.Queue;

public class QueueByLinkedList {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);


        System.out.println(q);

        System.out.println("Removing: " + q.poll());

        System.out.println(q);

        System.out.println("Peeking" + q.peek());

    }
}
