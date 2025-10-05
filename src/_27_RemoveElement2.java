import java.util.Arrays;
/** 
 * Kỹ thuật 2 con trỏ: Xoá phần tử trong mảng
 * 
 */
public class _27_RemoveElement2 {

    /**
     * Removes all occurrences of a given value from the array in-place.
     *
     * @param a input array
     * @param x value to remove
     * @return new logical length of the array after removals
     *
     * Algorithm (2-pointer):
     * - Use `i` to iterate over the entire array.
     * - Use `k` as a slow pointer marking the next valid position.
     * - Whenever a[i] != x, copy it to a[k] and increment k.
     * - Elements equal to x are skipped (not copied).
     *
     */
    public static int removeElement(int[] a, int x) {
        int k = 0; // slow pointer → next position for a non-x element
        for (int i = 0; i < a.length; i++) {
            if (a[i] != x) {
                // Keep the element by moving it forward
                a[k] = a[i];
                k++;
            }
            // else: skip element equal to x
        }
        return k;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 2, 3};
        System.out.println(removeElement(a, 3)); 

        System.out.println("modified array: ");
        System.out.println(Arrays.toString(a));         
    }
}
