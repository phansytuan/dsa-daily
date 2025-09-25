package effective_java;
// 3) Singleton bằng enum (khuyến nghị)

public enum DatabaseConnection {
  INSTANCE;

  // trạng thái, phương thức
  public void connect() { /* ... */ }
  public void disconnect() { /* ... */ }
}

// Sử dụng:
DatabaseConnection.INSTANCE.connect();
