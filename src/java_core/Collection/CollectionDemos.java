package java_core.Collection;

import java.util.*;

public class CollectionDemos {
  public static void main(String[] args) {

    // 1. List: ArrayList
    List<String> list = new ArrayList<>();
    list.add("A");               // [A]
    list.add("B");               // [A, B]
    list.add(1, "C");            // [A, C, B]
    System.out.println("List: " + list);
    System.out.println("Get idx 1: " + list.get(1)); // C


    // 2. Set: HashSet
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(2);                  // trùng, sẽ không thêm
    System.out.println("Set: " + set); // [1, 2] (không thứ tự cố định)


    // 3. Map: HashMap vs TreeMap
    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put("apple", 3);
    hashMap.put("banana", 2);
    hashMap.put("apple", 5);     // ghi đè value của key "apple"
    System.out.println("HashMap: " + hashMap);

    Map<String, Integer> treeMap = new TreeMap<>();
    treeMap.put("apple", 3);
    treeMap.put("cherry", 1);
    treeMap.put("banana", 2);
    System.out.println("TreeMap (sorted): " + treeMap);


    // 4. Queue: LinkedList làm queue, và PriorityQueue
    Queue<String> queue = new LinkedList<>();
    queue.offer("X");
    queue.offer("Y");
    System.out.println("Queue.peek(): " + queue.peek()); // X
    System.out.println("Queue.poll(): " + queue.poll()); // X

    Queue<Integer> pQueue = new PriorityQueue<>();
    pQueue.offer(30);
    pQueue.offer(10);
    pQueue.offer(20);
    System.out.println("PriorityQueue.poll(): " + pQueue.poll()); // 10 (is min-heap)


    // 5. Iterator
    Iterator<String> itr = list.iterator();
    System.out.print("Iterating List: ");

    while (itr.hasNext()) {
      String item = itr.next();
      System.out.print(item + " ");
      // it.remove(); // nếu muốn xoá item vừa duyệt
    }
  }
}
