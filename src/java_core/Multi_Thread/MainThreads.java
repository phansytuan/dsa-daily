package java_core.Multi_Thread;

public class MainThreads {

  public static void main(String[] args) {
    MyThread t1 = new MyThread("Luồng A");
    MyThread t2 = new MyThread("Luồng B");

    // Khởi động hai luồng song song
    t1.start();
    t2.start();

    // Thread chính đợi hai luồng kết thúc
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Cả hai luồng đã hoàn thành.");
  }
}