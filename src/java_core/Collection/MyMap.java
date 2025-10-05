package java_core.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        // HashMap: không đảm bảo thứ tự
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C++", 3);

        System.out.println("HashMap: " + hashMap); 

        // LinkedHashMap: giữ thứ tự chèn
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 10);
        linkedHashMap.put("B", 20);
        linkedHashMap.put("C", 30);
        System.out.println("LinkedHashMap: " + linkedHashMap); // {A=10, B=20, C=30}

        // TreeMap: sắp xếp theo key
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Z", 100);
        treeMap.put("X", 200);
        treeMap.put("Y", 300);
        System.out.println("TreeMap: " + treeMap); // {X=200, Y=300, Z=100}
    }    
}
