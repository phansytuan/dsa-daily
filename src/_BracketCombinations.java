import java.util.Scanner;

public class _BracketCombinations {

    // This method computes the nth Catalan number using an iterative formula
    public static long bracketCombinations(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0, got: " + n);
        }
        long result = 1;
        // Iterative formula: C(n+1) = C(n) * 2*(2*n+1) / (n+2)
        for (int i = 0; i < n; i++) {
            result = result * 2 * (2 * i + 1) / (i + 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pairs of parentheses: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input: expected a non-negative integer.");
            scanner.close();
            return;
        }
        int num = scanner.nextInt();
        scanner.close();
        if (num < 0) {
            System.out.println("Invalid input: expected a non-negative integer.");
            return;
        }
        System.out.println("Output: " + bracketCombinations(num));
    }
}
