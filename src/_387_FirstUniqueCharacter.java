public class _387_FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray(); // chuyển string về 1 mảng char[] arr

        int[] count = new int[123];
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
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
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
