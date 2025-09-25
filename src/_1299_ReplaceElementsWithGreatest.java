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
        for (int i = 1; i < n; i++) { // dịch các phần tử sang trái 1 đơn vị
            arr[i-1] = arr[i]; // phần tử hiện tại sẽ được gán cho phần tử ngay trước nó
        }
        if (n>0) arr[n-1] = -1;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
