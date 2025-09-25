public class _27_RemoveElement2 {
    public static int removeElement(int[] a, int x) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != x){
                a[k] = a[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int [] a = {3,2,2,3};
        System.out.println(removeElement(a,3));
        System.out.println("DONE!");
    }
}
