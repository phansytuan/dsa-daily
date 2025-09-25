public class _27_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n;) {
            // tìm phần tử muốn xoá
            if (nums[i] == val) {
                // xoá phần tử nums[i]
                for (int j = i; j <= (n - 2); j++) {
                    nums[j] = nums[j + 1]; // dồn số tiếp sau thay num[j]
                }
                n--;
            }
            else { // không phải xoá
                i++;
            }
        }
        return n;
        // số phần tử của mảng mới
    }
    public static void main(String[] args) {
        int [] a = {3,2,2,3};
        System.out.println(removeElement(a,3));
        System.out.println("DONE!");
    }
}
