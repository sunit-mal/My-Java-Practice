import java.util.Comparator;
import java.util.PriorityQueue;
// import java.util.Queue;

public class InCollectionPriorityQueue {
    public static void main(String[] args) {
        //Queue<Integer> pq = new PriorityQueue<>();    
                        //or
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //It use Min Heap. Here smallest element present in front
                                                    // Here Priority Seduling perform internally useing heapify
        //  offer Use to insert element in Queue
        pq.offer(25);
        pq.offer(12);
        pq.offer(20);
        pq.offer(2);
        pq.offer(5);
        pq.offer(10);

        System.out.println(pq); 
        
        pq.poll();
        System.out.println(pq); 
        
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());    //Here largest element present in front
        pq2.offer(25);
        pq2.offer(12);
        pq2.offer(20);
        pq2.offer(2);
        pq2.offer(5);
        pq2.offer(10);
        
        System.out.println(pq2);

    }
}
