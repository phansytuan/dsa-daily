public class _1662_CheckStringArraysEquivalent {
    public boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s : arr1) {
            sb1.append(s); // nối/nhét hết các phần tử trong arr1 vào r1
        }
        for (String s : arr2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) {}
}
