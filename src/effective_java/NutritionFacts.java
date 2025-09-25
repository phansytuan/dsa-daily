package effective_java;
// 2) Builder (khi nhiều tham số tùy chọn)

public final class NutritionFacts {
  private final int servingSize; // required
  private final int servings;    // required
  private final int calories;    // optional
  private final int fat;         // optional

  private NutritionFacts(Builder b) {
    servingSize = b.servingSize;
    servings = b.servings;
    calories = b.calories;
    fat = b.fat;
  }

  public static class Builder {
    private final int servingSize;
    private final int servings;
    private int calories = 0;
    private int fat = 0;

    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int c) { calories = c; return this; }
    public Builder fat(int f) { fat = f; return this; }

    public NutritionFacts build() {
      // validity checks
      if (servingSize <= 0 || servings <= 0) throw new IllegalArgumentException();
      return new NutritionFacts(this);
    }
  }
}

// Sử dụng:
NutritionFacts nf = new NutritionFacts.Builder(240, 2)
    .calories(100)
    .fat(1)
    .build();
