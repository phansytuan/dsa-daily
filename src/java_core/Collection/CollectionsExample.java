package java_core.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class  CollectionsExample {
  
  public static void main(String[] args) {

    // 1. List – cho phép trùng lặp, có thứ tự
    List<String> list = new ArrayList<>();
    list.add("Cơm");
    list.add("Phở");
    list.add("Bún");
    list.add("Phở"); // Trùng lặp vẫn được thêm
    System.out.println("List: " + list);

    // 2. Set – không cho phép trùng lặp, không giữ thứ tự
    Set<String> set = new HashSet<>();
    set.add("Cơm");
    set.add("Phở");
    set.add("Bún");
    set.add("Phở"); // Phở chỉ xuất hiện một lần
    System.out.println("Set: " + set);

    // 3. Map – lưu cặp key-value
    Map<String, Integer> map = new HashMap<>();
    map.put("An", 25);
    map.put("Bình", 30);
    map.put("Chi", 22);
    System.out.println("Map: " + map);

    System.out.println("Tuổi của Bình: " + map.get("Bình"));
  }
}
/*
  List giống hàng đợi (có thứ tự),
  Set giống tập hợp (không trùng, không thứ tự),
  Map giống sổ ghi chú “khóa → giá trị”.

  Dùng generics (List<String>) để chỉ rõ kiểu phần tử, tránh phải ép kiểu khi lấy ra.
*/