package java_core.Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class MyQueue {
    public static void main(String[] args) {
        // PriorityQueue: mặc định là min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);

        System.out.println("PriorityQueue: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // 1 3 5
        }
        System.out.println();

        // ArrayDeque: queue hai đầu
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        deque.addFirst("First");
        deque.addLast("Last");

        System.out.println("ArrayDeque: " + deque); // [First, A, B, C, Last]
        System.out.println("removeFirst: " + deque.removeFirst()); // First
        System.out.println("removeLast: " + deque.removeLast());   // Last
    }    
}
