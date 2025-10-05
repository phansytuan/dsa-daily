package java_core.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        // ArrayList: mảng động
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList: " + arrayList); // [Java, Python, C++]
        System.out.println("Phần tử index 1: " + arrayList.get(1)); // Python

        // LinkedList: danh sách liên kết
        List<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        linkedList.remove("Two"); // xoá phần tử "Two"
        System.out.println("LinkedList: " + linkedList); // [One, Three]
    }    
}
