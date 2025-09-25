package java_core;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class WriteReadFile {
  public static void main(String[] args) {
    String path = "output.txt";
    String content = "Xin chào Java Core 2.0!";

    // Ghi nội dung vào file
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
      writer.write(content);
      System.out.println("Đã ghi thành công vào " + path);
    }
    catch (IOException e) {
      System.err.println("Lỗi khi ghi file: " + e.getMessage());
    }

    // Đọc nội dung từ file
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String line;

      System.out.print("Nội dung đọc được: ");
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    }
    catch (IOException e) {
      System.err.println("Lỗi khi đọc file: " + e.getMessage());
    }
  }
}