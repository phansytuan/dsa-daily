public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        boolean bIsIncreasing = true; // important, ban đầu nó đã đang tăng

        if (n<3) return false;

        for (int i = 0; (i+1) < n; i++) {
            int j = i+1;  // j là phần tử phía sau

            if( arr[i] > arr[j] ) { // xét khi dãy bắt đầu giảm
                if (i == 0) { return false; }
                // Nếu i == 0, tức là phần tử đầu tiên (arr[0]) đã lớn hơn phần tử tiếp theo (arr[1]).

                if(bIsIncreasing == false) { // Kiểm tra xem trước đó dãy đã từng giảm chưa (bIsIncreasing == false).
                    // normal
                } else {
                    bIsIncreasing = false;
                }
            }
            else if ( arr[i] < arr[j] ) { // xét khi dãy tăng
                if (bIsIncreasing == true) {
                    // normal
                }
                else { // bIsIncreasing = false: dãy đang xét đột nhiên bị giảm
                    return false;
                }
            } else { // arr[i] == arr[j]
                return false;
            }
        }
        if (bIsIncreasing == false) { // dãy đang xét cuối cùng là dãy giảm
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
}
