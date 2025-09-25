public class _26_RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int curIndex = 0;

        if(n==0) return 0;

        for (int i = 1; i < nums.length; i++) {
            if ( nums[i] != nums[curIndex] ) {
                curIndex++;
                nums[curIndex] = nums[i];
            }
        }
        return curIndex + 1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
