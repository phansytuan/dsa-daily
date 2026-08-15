package java_core.Exception_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UncheckedIOException;

public class FileReaderExample {

  public static void main(String[] args) {
//  String path = "data.txt";
    String path = "output0.txt";

    // Try-with-resources: tự động đóng BufferedReader khi xong
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println("Nội dung: " + line);
      }
    }
    catch (IOException e) {  // Bắt lỗi I/O (file không tồn tại, lỗi đọc, v.v.)
      // Bọc lại và ném tiếp: giữ nguyên nguyên nhân gốc thay vì chỉ in ra rồi kết thúc bình thường
      throw new UncheckedIOException("Không đọc được file " + path, e);
    }
    finally {  // Khối này luôn chạy, nhưng ở dạng try-with-resources, reader đã được đóng tự động
      System.out.println("Kết thúc việc đọc file.");
    }
  }
}