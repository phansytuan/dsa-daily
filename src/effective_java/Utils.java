package effective_java;
// 4) Ngăn khởi tạo utility class

public final class Utils {
  private Utils() {
    throw new AssertionError("No instances");
  }

  public static int max(int a, int b) { return a >= b ? a : b; }
}
