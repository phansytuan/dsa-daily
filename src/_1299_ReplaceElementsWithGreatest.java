import util.ArrayUtils;

public class _1299_ReplaceElementsWithGreatest {
    public static int[] replaceElements(int[] arr) {

        int n = arr.length;
        for (int i = n-1; i >= 0; i--) {
            if (i == n-1) {
                // do nothing, vì giá trị lớn nhất từ n-1 đến n-1 chính là bản thân arr[n-1]
            } else {
                arr[i] = Math.max(arr[i], arr[i+1]);
            }
        }
        ArrayUtils.shiftLeft(arr, 0, n-2); // dịch các phần tử sang trái 1 đơn vị
        if (n>0) arr[n-1] = -1;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);
        ArrayUtils.printArray(arr);
    }
}
