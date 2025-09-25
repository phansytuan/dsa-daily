package java_core.Multithreading_ThreadPool;

/* Lock sẽ tự được cấp cho một thread nào đó đang chờ */
public class Counter_synchronized {
  private int count = 0;

  /* Khóa trên instance hiện tại (object lock)
     Chỉ một thread có thể gọi method này tại một thời điểm. */
  public synchronized void increment() {
    count++;
  }

  /* Khóa trên Class object (static lock)
     Đây là một synchronized method tĩnh, tức là tất cả các thread gọi vào
     sẽ phải đồng bộ hóa tại cùng một time (đều phải đợi nhau và gọi vào phương thức đó một cách tuần tự) */
  public static synchronized void staticIncrement() {
    // logic tĩnh
  }

  /* Khóa trên một đối tượng bất kỳ (lock trên đối tượng) */
  public void blockIncrement() {
    synchronized (this) {
      count++;
    }
  }

  public int getCount() {
    return count;
  }  // Getter để lấy giá trị count


  public static void main(String[] args) {
    Counter_synchronized counter = new Counter_synchronized();

    // Tạo nhiều thread để thử nghiệm đồng bộ hóa
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 1000; i++) {
          counter.increment();
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 1000; i++) {
          counter.increment();
        }
      }
    });

    // Khởi tạo và chạy các thread
    t1.start();
    t2.start();

    // Đợi cho các thread hoàn thành
    try {
      t1.join();
      t2.join();
    }
    catch (InterruptedException e) {
      e.printStackTrace();
    }

    // In ra kết quả cuối cùng của biến count
    System.out.println("Final count: " + counter.getCount());
  }
}
