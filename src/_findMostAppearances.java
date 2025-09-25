public class _findMostAppearances {
    public static int[] findMostAppearances(int[] list) {
        if (list==null || list.length ==0){
            return new int[] {0};
        }
        if(list.length > 1000){
            return new int[] {0};
        }
        for(int num:list){
            if(num > 100 || num < 2){
                return new int[] {0};
            }
        }
        int[]count=new int[102];
        for (int num:list){
            count[num]++;
        }

        int maxCount=0;
        for (int i=2; i <= 100;i++){
            if (count[i] >maxCount){
                maxCount=count[i];
            }
        }

        int sum=0;
        for (int i =2; i<=100; i++) {
            if ( count[i]==maxCount && maxCount>0 ) {
                sum = sum + i*count[i];
            }
        }
        return new int[] {sum};
    }

    public static void main(String[] args) {
            int[] test1 = {2, 2, 3, 3, 3};
            System.out.println("Test 1 result: " + java.util.Arrays.toString(findMostAppearances(test1))); // [9] (3 * 3)

            int[] test2 = {2, 4, 4, 4, 5};
            System.out.println("Test 2 result: " + java.util.Arrays.toString(findMostAppearances(test2))); // [12] (4 * 3)
    }
}
