package java_core.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        // HashSet: không trùng, không thứ tự
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3); // bị bỏ qua vì trùng
        System.out.println("HashSet: " + hashSet); // [1, 2, 3] (thứ tự ngẫu nhiên)

        // LinkedHashSet: giữ thứ tự chèn
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        System.out.println("LinkedHashSet: " + linkedHashSet); // [3, 1, 2]

        // TreeSet: sắp xếp tăng dần
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        System.out.println("TreeSet: " + treeSet); // [1, 3, 5]
    }    
}
