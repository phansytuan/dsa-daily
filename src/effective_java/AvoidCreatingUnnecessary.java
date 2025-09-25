//package effective_java;
//// 6) Tránh tạo đối tượng không cần thiết
//
//public class AvoidCreatingUnnecessary {
//  // DÀNG: tạo thừa
//  String s1 = new String("hello"); // tạo String mới mỗi lần
//
//  // TỐT: reuse literal
//  String s2 = "hello"; // reuse pool
//
//  // Autoboxing cảnh báo
//  long sum = 0L;
//  for (int i = 0; i < 1_000_000; i++) {
//    Long x = (long) i; // tạo object Long mỗi lần → chậm
//    sum += x;
//  }
//  // Thay bằng primitive:
//  long fastSum = 0L;
//  for (int i = 0; i < 1_000_000; i++) {
//    fastSum += i; // nhanh, không boxing
//  }
//
//}
