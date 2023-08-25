import java.util.ArrayDeque;

public class InCollectionDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(22);   //  Add Element in Back/Rear
        dq.offerFirst(12);  //  Add element in Front/Head
        dq.offerLast(11);   //Same as offer , add element in Back/Rear

        System.out.println(dq);

        System.out.println(dq.peek());  //  Show Front element 
        System.out.println(dq.peekFirst()); //  Show Front element
        System.out.println(dq.peekLast());  //  Show Rear element

        dq.pollFirst();     //  Deletion perform from Front     [Note: dq.poll() also same]
        System.out.println(dq);
        dq.pollLast();      //  Deletion perform from Rear
        System.out.println(dq);
    }
}
