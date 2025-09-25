package java_core.Generic;

public class MainGeneric {
  public static void main(String[] args) {

    // Hộp chứa String
    Box<String> stringBox = new Box<>("Xin chào");
    System.out.println("Giá trị trong stringBox: " + stringBox.getValue());

    // Hộp chứa Integer
    Box<Integer> intBox = new Box<>(123);
    System.out.println("Giá trị trong intBox: " + intBox.getValue());

    // Nếu không dùng generic, phải ép kiểu thủ công:
    Box rawBox = new Box("Test");
    String s = (String) rawBox.getValue(); // cần cast
    System.out.println("Giá trị trong rawBox: " + s);
  }
}

/*
  Box<T> cho phép tạo hộp có kiểu cụ thể khi khởi tạo (String, Integer).
  Tránh phải ép kiểu thủ công
*/