import java.util.Scanner;

public class _BracketCombinations {

    // This method computes the nth Catalan number using an iterative formula
    public static long bracketCombinations(int n) {
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
        int num = scanner.nextInt();
        System.out.println("Output: " + bracketCombinations(num));
        scanner.close();
    }
}
