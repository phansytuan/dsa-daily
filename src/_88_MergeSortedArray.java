/**
 * LeetCode 88 - Merge Sorted Array
 *
 * This class provides a method to merge two sorted arrays into one sorted array.
 * nums1 has enough space at the end to hold all elements from nums2.
 */
public class _88_MergeSortedArray {

    /**
     * Merge nums2 into nums1 as one sorted array.
     *
     * @param nums1 the first sorted array, with extra space at the end to hold nums2
     * @param m     the number of valid elements in nums1
     * @param nums2 the second sorted array
     * @param n     the number of elements in nums2
     *
     * Ex:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6], n = 3
     * => nums1 becomes [1,2,2,3,5,6]
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int element : nums2) {
            insertIntoSortedArray(element, nums1, m);
            m++; // tăng m vì đã thêm 1 phần tử mới vào nums1
        }
    }

    /**
     * Insert a number into the correct position in a sorted array.
     * This method shifts larger elements to the right before inserting.
     *
     * @param value the number to insert
     * @param arr   the sorted array with extra space at the end
     * @param size  the current number of valid elements in arr
     */
    private static void insertIntoSortedArray(int value, int[] arr, int size) {
        boolean inserted = false;

        for (int k = 0; k < size; k++) {
            if (arr[k] > value) {
                // Found the position -> shift elements right
                for (int i = size - 1; i >= k; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[k] = value;
                inserted = true;
                break;
            }
        }

        if (!inserted) {
            // If no larger element found, place value at the end
            arr[size] = value;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 5, 0, 0, 0};
        int[] nums2 = {3, 0, 6};
        merge(nums1, 4, nums2, 3);

        // Expected nums1 after merge: [2,3,3,4,5,6,0]
        // (Note: nums2 contains "0", so final array still sorted correctly. các giá trị 0 như "vị trí trống")
        System.out.println(java.util.Arrays.toString(nums1));
    }
}
