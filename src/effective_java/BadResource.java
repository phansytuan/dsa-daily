package effective_java;
// 8) Tránh finalizer/cleaner — dùng AutoCloseable + try-with-resources

// KHÔNG NÊN: finalizer (ví dụ minh họa, không dùng)
@SuppressWarnings("deprecation")
class BadResource {
  @Override protected void finalize() throws Throwable {
    // không tin cậy và gây hiệu năng kém
    super.finalize();
  }
}

// NÊN DÙNG:
class GoodResource implements AutoCloseable {
  public GoodResource() { /* open resource */ }
  public void doSomething() { /* ... */ }
  @Override public void close() { /* release resource */ }
}

// Sử dụng try-with-resources (đảm bảo close, preserve exception)
try (GoodResource r = new GoodResource()) {
    r.doSomething();
} // r.close() tự động được gọi

