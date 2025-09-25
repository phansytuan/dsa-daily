public class _1346_CheckIfNAndDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if ( arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i] ) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {10,2,6,3,6};
        checkIfExist(arr);
    }
}
