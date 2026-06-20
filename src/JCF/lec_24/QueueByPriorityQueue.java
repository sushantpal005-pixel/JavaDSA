package JCF.lec_24;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueByPriorityQueue {
    static void main() {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        // default behaviour -> Integers -> less value -> high priority -> minHeap
        // maxHeap -> Integers -> high value -> high priority
        // pq -> strings -> comparator
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());

    }
}
