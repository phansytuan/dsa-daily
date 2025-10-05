package java_core.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyCollectionsUtil {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));

        Collections.sort(nums);
        System.out.println("Sorted: " + nums); // [1, 2, 3, 5, 8]

        Collections.reverse(nums);
        System.out.println("Reversed: " + nums); // [8, 5, 3, 2, 1]

        Collections.shuffle(nums);
        System.out.println("Shuffled: " + nums);

        System.out.println("Max: " + Collections.max(nums));
        System.out.println("Min: " + Collections.min(nums));
    }    
}
