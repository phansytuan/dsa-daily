public class _88_MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int ai : nums2){
            chenPhanTuVaoMang(ai,nums1,m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int x, int[] a, int m) {
        boolean timDuocK = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                timDuocK = true;
                for (int i = m - 1; i >= k; i--) {
                    a[i+1] = a[i];

                }   // dịch chuyển xong những phần tử lớn hơn sang phải
                a[k] = x;
                break;
            }
        }
        if (!timDuocK) {
            a[m] = x; // không có phần tử nào lớn hơn thì x lớn nhất, ở sau cùng
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5,0,0,0};
        int[] nums2 = {3,0,6};
        merge(nums1,4,nums2,3);
        System.out.println("Done!");
    }
}
