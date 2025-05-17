package BasicSorts;

public class SelectionSort {
    public static int[] selectionSort(int[] nums){
        int minIndex;
        for(int i=0; i<nums.length-1; i++){
            minIndex = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {4,2,6,5,1,3};
        selectionSort(nums);
        for(int i : nums){
            System.out.print(i + " -> ");
        }
    }
}
