package java_core.Generic;

public class Box<T> {
  private T value; // T là kiểu generic

  public Box(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}