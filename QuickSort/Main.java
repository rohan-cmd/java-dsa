package QuickSort;

public class Main {
    private static void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
    private static int pivot(int array[], int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for(int i = pivotIndex + 1; i<=endIndex; i++){
            if (array[i]<array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);

        return swapIndex;
    }
    public static void quickSort(int[] nums, int left, int right){
        if (left<right) {
            int pivotIndex = pivot(nums, left, right);
            quickSort(nums, left, pivotIndex-1);
            quickSort(nums, pivotIndex+1, right); 
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,2,6,5,1,3};
        quickSort(nums, 0, nums.length-1);
        for(int i : nums){
            System.out.print(i + " -> ");
        }        
    }
}
