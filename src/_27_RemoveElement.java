import java.util.Arrays;

/** 
 * Thao tác Xoá phần tử trong mảng 
 */
public class _27_RemoveElement {

    /**
     * Removes all occurrences of a given value from the array in-place.
     * This method shifts elements left whenever a match is found, effectively overwriting removed elements.
     *
     * @param nums input array
     * @param val  value to remove
     * @return new length of the array after removal
     *
     * Note: Order of remaining elements is preserved.
     */
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;

        // Loop through array while shrinking 'n' dynamically
        for (int i = 0; i < n;) {

            if (nums[i] == val) {
                // Found element to remove -> shift all subsequent elements left
                for (int j = i; j <= (n - 2); j++) {
                    nums[j] = nums[j + 1];
                }
                n--; // Reduce effective array length

                // note: we do not increment i here because the new nums[i] could also equal val and needs to be checked again
            } else {
                i++; // Safe to advance if no removal
            }
        }

        // Return new logical length (not physical length of nums[])
        return n;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 2, 3};
        System.out.println(removeElement(a, 3)); // Expected output: 2

        System.out.println("modified array: ");
        System.out.println(Arrays.toString(a));         
    }
}
