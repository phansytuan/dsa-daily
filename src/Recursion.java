public class Recursion {
    public static int Fibonacci(int n) {
        // 1. bai toan co so
        if (n<=2)
            return 1;
        // 2. cong thuc quy nap
        int Fn = Fibonacci(n-1) + Fibonacci(n-2);
        return Fn;
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci(5 ));
        System.out.println(Fibonacci(9));
    }
}
