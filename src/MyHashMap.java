import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("apple", 0.50);
        map.put("orange", 0.45);
        map.put("banana", 0.45);
        map.put("grapes", 0.45);
        System.out.println(map);

        // Ở đây, nó yêu cầu hai thao tác cho mỗi mục
        // một để lấy khóa tiếp theo & một để tra cứu giá trị bằng get
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Map.Entry lưu trữ cả khóa và giá trị cùng nhau trong một lớp,
        // chúng ta có được cả hai trong một thao tác duy nhất .
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
