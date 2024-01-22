import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.LinkedList;

/*Both linkedlist and priority queue implements queue interface*/

class QueueDemo {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        LinkedList<Integer> ll = new LinkedList();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.offer(4);
        pq.offer(5);
        pq.offer(6);
        pq.remove();
        pq.poll();
        // Iterator it = pq.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        while(pq.size() > 0){
            System.out.println(pq.element());
            // pq.poll();
            pq.remove();
        }
        
        ll.add(10);
        ll.offer(20);
        while(ll.size() > 0){
            System.out.println(ll.element());
            ll.poll();
        }
    }
}
