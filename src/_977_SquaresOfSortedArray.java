public class _977_SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int s = arr.length;

        // tim i va j
        // tim i: là số âm cuối cùng trong dãy
        int i = -1;
        while ( i+1 < s && nums[i+1] < 0 ){
            i++;
        }
        // tim j: là giá trị không âm trái cùng trong dãy
        int j = s;
        while( (j-1) >= 0 && nums[j-1] >= 0 ){
            j--;
        }
        int k =0; // index of arr
        // System.out.println("i="+i+" j="+j);

        while ( i>=0 || j<s ) {
            if ( i>=0 && j<s ) {  // both i and j are valid
                int ii = nums[i] * nums[i];
                int jj = nums[j] * nums[j];

                if (ii <= jj) {
                    arr[k] = ii;
                    i--; k++;
                }
                else {
                    arr[k] = jj;
                    j++; k++;
                }
            }
            else if (i >= 0) {  // only i valid
                arr[k] = nums[i] * nums[i];
                i--; k++;
            }
            else { // only j valid
                arr[k] = nums[j] * nums[j];
                j++; k++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums= {-4,-1,0,3,10};
        int[] arr= sortedSquares(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
