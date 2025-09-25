package java_core.Multi_Thread;

public class MyThread extends Thread {

  private String name;

  public MyThread(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    // Code này sẽ chạy trong luồng riêng
    for (int i = 1; i <= 5; i++) {
      System.out.println(name + " in lần thứ " + i);

      try {
        Thread.sleep(900); // Tạm dừng 0.9 giây
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}