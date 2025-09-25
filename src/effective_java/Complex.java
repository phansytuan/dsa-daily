package effective_java;
// 1) Static factory methods (thay constructor)

public final class Complex {
  private final double re;
  private final double im;

  private static final Complex ZERO = new Complex(0, 0); // cached instance

  private Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  // static factory với tên rõ nghĩa
  public static Complex fromCartesian(double re, double im) {
    if (re == 0 && im == 0) return ZERO; // reuse
    return new Complex(re, im);
  }

  public static Complex fromPolar(double r, double theta) {
    return new Complex(r * Math.cos(theta), r * Math.sin(theta));
  }

  @Override public String toString() { return re + " + " + im + "i"; }
}
