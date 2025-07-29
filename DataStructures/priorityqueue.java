package DataStructures;
import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {
        
        
        //priority works based on "MinHeap"
            //formula
            //priority -> (i-1)/2
            //parentNode < childNode

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.add(6);
        // pq.add(1);
        // pq.add(2);
        // pq.add(4);
        // System.out.print(pq);

        //descending order 
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(a<b)?1:-1);
        // pq.add(6);
        // pq.add(1);
        // pq.add(7);
        // pq.add(5);
        // System.out.print(pq);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(a<b)?1:-1);
        pq.add(6);
        pq.add(1);
        pq.add(7);
        pq.add(5);
        System.out.print(pq);
    }
}