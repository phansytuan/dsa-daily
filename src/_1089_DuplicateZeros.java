import util.ArrayUtils;

public class _1089_DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) { // nếu tìm được 1 số a[i]= 0
                // dịch a[i+1] -> a[n-2] sang phải 1 đơn vị
                ArrayUtils.shiftRight(arr, i+1, n-2);

                if ( i+1 < n ){
                    // và gán a[i+1] = 0
                    arr[i+1] = 0; //duplicateZeros
                    i++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3};
        duplicateZeros(arr);
        ArrayUtils.printArray(arr);
    }
}
