public class _941_Valid_Mountain_Array2 {
    public static boolean validMountainArray(int[] arr) {
        int length = arr.length;
        if (length < 3) return false;

        int index =0;
        //len nui
        while(index+1 < length && arr[index] < arr[index+1]) {
            index++;
        }
        if( index==0 || index==length-1) return false; // Nếu index == 0: Mảng chỉ có pha giảm, không hợp lệ.Nếu index == length - 1: Mảng chỉ có pha tăng, không hợp lệ.

        //xuong nui
        while(index+1<length && arr[index]>arr[index+1]){ // Nếu arr[index] không còn lớn hơn arr[index + 1], vòng lặp dừng lại.
            index++;
        }

        if(index==length-1) { //Nếu index đến được cuối mảng (index == length - 1), tức là mảng có dạng tăng rồi giảm → Dãy núi hợp lệ.
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr= {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
}
