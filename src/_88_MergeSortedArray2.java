/**
 * Kỹ thuật 2 con trỏ: Thêm phần tử vào mảng. 
 * 
 * Duyệt 2 mảng một lúc với 2 chỉ số khác nhau. Điều khiển nhiều biến trên nhiều mảng.
 */
public class _88_MergeSortedArray2 {

    /**
     * Merges 2 sorted arrays into the 1st one (in-place).
     *
     * @param n1 first array with enough trailing space to hold elements from n2.
     *           Its first 'm' elements are sorted, the rest are placeholders (usually 0).
     * @param m  number of valid elements in n1.
     * @param n2 second array with 'n' valid sorted elements.
     * @param n  number of valid elements in n2.
     *
     * Algorithm:
     * - Start from the end of both arrays (i = m-1, j = n-1).
     * - Place the larger of n1[i] / n2[j] into the last available slot in n1 (k).
     * - This avoids overwriting unprocessed elements in n1.
     * 
     */
    public static void merge(int[] n1, int m, int[] n2, int n) {
        int i = m - 1;          // pointer - last valid element n1
        int j = n - 1;          // pointer - last element n2
        int k = (m + n) - 1;    // pointer for last position in n1 (full length)

        // Iterate backwards to prevent overwriting unmerged elements in n1
        while (k >= 0) {
            if (j < 0) {
                // n2 is exhausted → just copy remaining n1 elements
                n1[k] = n1[i];
                i--;
            }
            else if (i < 0) {
                // n1 is exhausted → copy remaining n2 elements
                n1[k] = n2[j];
                j--;
            }
            else if (n1[i] > n2[j]) {
                // Place larger element first to maintain sorted order
                n1[k] = n1[i];
                i--;
            }
            else {
                // n1[i] <= n2[j] → take from n2
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
        int[] n1 = {7, 8, 9, 0, 0, 0};
        int[] n2 = {4, 5, 6};
        merge(n1, 3, n2, 3);

        for (int num : n1) {
            System.out.print(num + " ");
        }
        System.out.println("\nDone!");
    }
}
