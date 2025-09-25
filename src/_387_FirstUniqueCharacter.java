public class _387_FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray(); // chuyển string về 1 mảng char[] arr, để dễ truy cập từng ký tự.

        int[] count = new int[123]; // đếm số lần xuất hiện của mỗi ký tự trong s
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i]; // từng ký tự hiện tại
            int index = (int) c; // giá trị ASCII của ký tự c, sẽ dùng tra cứu trong count
            count[index]++;
        }
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            if(count[index] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "lovveleettcode";
        System.out.println(firstUniqChar(s));
    }
}
