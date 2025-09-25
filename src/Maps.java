import java.util.HashMap;
import java.util.LinkedHashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIDs = new HashMap<>(); // respecify // Key is String & Value is Integer
        empIDs.put("John", 123);
        empIDs.put("Jane", 456);
        empIDs.put("Bob", 789);

        System.out.println(empIDs);
        System.out.println(empIDs.get("John"));
        System.out.println(empIDs.containsKey("Bob"));
        System.out.println(empIDs.containsValue(123));
        LinkedHashMap<String, Integer> emp = new LinkedHashMap<>();
    }
}
