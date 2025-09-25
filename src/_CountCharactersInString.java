//import java.util.Scanner;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//class _CountCharactersInString {
//
//    static void parseText(String data) {
//
//        // nếu chuỗi rỗng thì in ra "empty"
//        if (data.length() == 0) {
//            System.out.println("empty");
//            return;
//        }
//
//        // Dùng LinkedHashMap để lưu số lần xuất hiện của từng ký tự theo thứ tự ban đầu
//        LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();
//        for (int i = 0; i < data.length(); i++) {
//            char ch = data.charAt(i);
//            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
//        }
//
//        // Xây dựng chuỗi kết quả: mỗi cặp có dạng "ký tự counter"
//        // Nếu ký tự là space thì in ra "space" thay vì " "
//        StringBuilder sb = new StringBuilder();
//        boolean first = true;
//        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
//            if (!first) {
//                sb.append(",");
//            }
//            char key = entry.getKey();
//            if (key == ' ') {
//                sb.append("space");
//            } else {
//                sb.append(key);
//            }
//            sb.append(" ").append(entry.getValue());
//            first = false;
//        }
//
//        System.out.println(sb.toString());
//    }
//
//    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        String input;
//
//        while (myObj.hasNextLine()) {
//            input = myObj.nextLine();
//            parseText(input);
//        }
//        myObj.close();
//    }
//}
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

class _CountCharactersInString {

    static void parseText(String data) {
        if(data.isEmpty()){
            System.out.println("empty");
            return;
        }
        LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<>();
        for(char ch : data.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }
        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            if(result.length() > 0) {
                result.append(",");
            }
            result.append(entry.getKey() == ' ' ? "space" : entry.getKey())
                    .append(" ")
                    .append(entry.getValue());
        }
        System.out.println(result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            parseText(sc.nextLine());
        }
        sc.close();
    }
}
/*
LinkedHashMap là gì?
LinkedHashMap là một lớp trong Java thuộc gói java.util, là một phần của Java Collections Framework. Nó là một sự kết hợp giữa cấu trúc dữ liệu HashMap và LinkedList,
cung cấp khả năng lưu trữ các cặp khóa-giá trị (key-value) giống như HashMap, nhưng với một đặc điểm nổi bật là duy trì thứ tự của các phần tử.

Đặc điểm chính của LinkedHashMap
Duy trì thứ tự chèn (Insertion Order):
Không giống như HashMap (không đảm bảo thứ tự), LinkedHashMap giữ nguyên thứ tự mà các phần tử được thêm vào.
Khi bạn lặp qua các phần tử, chúng sẽ xuất hiện theo đúng thứ tự chèn.

Hiệu suất:
Các thao tác cơ bản như put (thêm), get (lấy) và remove (xóa) có độ phức tạp thời gian trung bình tương tự HashMap.
Tuy nhiên, nó sử dụng nhiều bộ nhớ hơn một chút do phải duy trì một danh sách liên kết đôi (doubly linked list) để theo dõi thứ tự.
Cấu trúc bên trong:
LinkedHashMap sử dụng danh sách liên kết đôi để liên kết các phần tử theo thứ tự. Khi thêm một phần tử, nó được đặt ở cuối danh sách;
khi xóa, phần tử đó được loại bỏ khỏi danh sách.
Hỗ trợ thứ tự truy cập (Access Order):
Ngoài thứ tự chèn, LinkedHashMap có thể được cấu hình để duy trì thứ tự truy cập, tức là sắp xếp các phần tử theo lần truy cập cuối cùng (qua get hoặc put).
Tính năng này rất hữu ích để triển khai các cấu trúc như LRU Cache (Least Recently Used), nơi các phần tử ít được sử dụng gần đây nhất sẽ bị loại bỏ.
Khả năng lặp:
Khi sử dụng các phương thức như entrySet(), keySet(), hoặc values() để lặp qua LinkedHashMap, các phần tử sẽ được trả về theo thứ tự chèn (hoặc thứ tự truy cập nếu được bật).
Ví dụ minh họa
Ví dụ 1: Duy trì thứ tự chèn
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
Kết quả:
Apple : 1
Banana : 2
Cherry : 3

Ví dụ 2: Duy trì thứ tự truy cập
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Tham số thứ 3 (true) bật thứ tự truy cập
        Map<String, Integer> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        map.get("Banana"); // Truy cập "Banana"

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
Kết quả:
Apple : 1
Cherry : 3
Banana : 2
("Banana" được di chuyển xuống cuối vì nó vừa được truy cập.)

Khi nào nên sử dụng LinkedHashMap?
Khi bạn cần một Map mà thứ tự của các phần tử quan trọng (theo thứ tự chèn hoặc truy cập).
Khi triển khai các cấu trúc như cache, cần quản lý phần tử dựa trên lần sử dụng gần nhất.
Khi muốn kết hợp tốc độ truy cập nhanh của HashMap với khả năng duy trì thứ tự của LinkedList.
Kết luận
LinkedHashMap một công cụ cho phép quản lý các cặp khóa-giá trị với khả năng duy trì thứ tự chèn hoặc thứ tự truy cập, tùy theo nhu cầu ứng dụng.
Nó là lựa chọn lý tưởng khi bạn cần sự cân bằng giữa hiệu suất và khả năng kiểm soát thứ tự dữ liệu.
* */