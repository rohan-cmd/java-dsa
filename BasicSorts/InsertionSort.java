package BasicSorts;

public class InsertionSort {
    public static void insertionSort(int[] nums){
        for(int i=1; i<nums.length; i++){
            int temp = nums[i];
            int j = i-1;
            while (j>-1 && temp<nums[j]) {
                nums[j+1] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,2,6,5,1,3};
        insertionSort(nums);
        for(int i : nums){
            System.out.print(i + " -> ");
        }        
    }
}
