package java_core.Multithreading_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
  public static void main(String[] args) {

    // Tạo một ExecutorService với FixedThreadPool có 4 threads
    ExecutorService executor = Executors.newFixedThreadPool(4);

    // Tạo và submit 10 task vào executor
    for (int i = 0; i < 50; i++) {
      final int taskId = i;  // Sử dụng final để truyền vào lambda expression⬇️

      executor.submit(() -> {
        System.out.println("Task " + taskId + " chạy bởi " + Thread.currentThread().getName());  // In ra thông tin task đang chạy cùng với tên thread
      });
    }

    executor.shutdown();  // Sau khi submit hết các task, gọi shutdown() để không nhận thêm task mới


    // Chờ tất cả các task đã hoàn thành
    try {
      if (!executor.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS)) {
        executor.shutdownNow();  // Hủy các task còn lại nếu không hoàn thành trong thời gian chờ
      }
    }
    catch (InterruptedException e) {
      executor.shutdownNow();  // Nếu bị ngắt, hủy các task còn lại
      Thread.currentThread().interrupt();
    }
  }
}
