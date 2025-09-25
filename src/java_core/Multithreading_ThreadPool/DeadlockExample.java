package java_core.Multithreading_ThreadPool;

public class DeadlockExample {

  private static final Object lockA = new Object();
  private static final Object lockB = new Object();

  public static void main(String[] args) {

    // Thread 1
    Thread thread1 = new Thread(() -> {
      synchronized (lockA) {
        System.out.println("Thread 1: Holding lockA");

        try {
          Thread.sleep(100);  // Giả lập công việc
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }

        System.out.println("Thread 1: Waiting for lockB...");
        synchronized (lockB) {
          System.out.println("Thread 1: Acquired lockB");
        }
      }
    });

    // Thread 2
    Thread thread2 = new Thread(() -> {
      synchronized (lockB) {
        System.out.println("Thread 2: Holding lockB");

        try {
          Thread.sleep(100);  // Giả lập công việc
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }

        System.out.println("Thread 2: Waiting for lockA...");
        synchronized (lockA) {
          System.out.println("Thread 2: Acquired lockA");
        }
      }
    });

    thread1.start();
    thread2.start();
  }
}
