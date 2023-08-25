import java.util.LinkedList;
import java.util.Queue;

public class InCollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //  Offer Use to Insert element From Tail/Rear/Back
        q.offer(25);
        q.offer(12);           
        q.offer(2);
        q.offer(7);
        q.offer(18);

        System.out.println(q);
        
        //  Pll Use to Delete Element From Head/Front
        q.poll();
        System.out.println(q);

        //  Peek Use to return Next delete element
        System.out.println(q.peek());
        
    }
}
