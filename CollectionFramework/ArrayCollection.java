package CollectionFramework;
import java.util.*;

public class ArrayCollection {
    public static void main(String[] args) {
        // Arrays Class
        int[] nums = {5,7,1,0,6,2};

        Arrays.sort(nums);
        for(int e : nums){
            System.out.print(e + " -> ");
        }
        System.out.println();

        System.out.println(Arrays.binarySearch(nums, 5));

        Arrays.fill(nums, 0);
        for(int e : nums){
            System.out.print(e + " -> ");
        }
        System.out.println();

        // Collections Class
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(7);
        arr.add(1);
        arr.add(0);
        arr.add(8);

        System.out.println(arr);
        
        // Collections.sort(arr); // ASC
        // Collections.sort(arr, Comparator.reverseOrder()); // DESC
        // System.out.println(arr);

        System.out.println(Collections.min(arr));
        System.out.println(Collections.max(arr));
        System.out.println(Collections.frequency(arr, 5));

    }
}
