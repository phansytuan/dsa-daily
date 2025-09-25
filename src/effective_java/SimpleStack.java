package effective_java;
import java.util.EmptyStackException;
// 7) Loại bỏ tham chiếu đã lỗi thời (prevent memory leak)

public class SimpleStack<E> {
  private Object[] elements;
  private int size = 0;

  public SimpleStack(int capacity) { elements = new Object[capacity]; }

  public void push(E e) { elements[size++] = e; }

  public E pop() {
    if (size == 0) throw new EmptyStackException();
    @SuppressWarnings("unchecked")
    E result = (E) elements[--size];
    elements[size] = null; // <-- null out obsolete reference
    return result;
  }
}

