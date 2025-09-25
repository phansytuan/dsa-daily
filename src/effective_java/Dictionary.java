package effective_java;
import java.util.Objects;
// 5) Dependency Injection (tránh hardwiring)

public interface Dictionary {
  boolean contains(String word);
}

public class EnglishDictionary implements Dictionary {
  public boolean contains(String word) { /* lookup */ return true; }
}

public class SpellChecker {
  private final Dictionary dictionary;

  // DI qua constructor → dễ test, dễ thay đổi implement
  public SpellChecker(Dictionary dictionary) {
    this.dictionary = Objects.requireNonNull(dictionary);
  }

  public boolean check(String word) {
    return dictionary.contains(word);
  }
}

// Sử dụng (in prod):
SpellChecker sc = new SpellChecker(new EnglishDictionary());

// Sử dụng (unit test with fake):
SpellChecker testSc = new SpellChecker(word -> word.length() > 0); // lambda as Dictionary
