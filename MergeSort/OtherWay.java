package MergeSort;

public class OtherWay {
    public static void merge(int[] nums, int left, int midIndex, int right){

        int[] newNums = new int[right-left+1];
        int i = left; 
        int j = midIndex+1;
        int k = 0;

        while (i<=midIndex && j<=right){
            if(nums[i]<=nums[j]){
                newNums[k] = nums[i];
                i++;
            }else{
                newNums[k] = nums[j];
                j++;                
            }
            k++;
        }

        while (i<=midIndex) {
            newNums[k] = nums[i];
            i++;   
            k++;         
        }

        while (j<=right) {
            newNums[k] = nums[j];
            j++;   
            k++;         
        }       

        for(int x=0;  x<newNums.length; x++){
            nums[left+ x] = newNums[x];
        }

    }
    public static void mergeSort(int[] nums, int left, int right){
        if(left<right){
            int midIndex = (left+right)/2;

            mergeSort(nums, left, midIndex);
            mergeSort(nums, midIndex+1, right);

            merge(nums, left, midIndex, right);
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,2,6,5,1,3};
        mergeSort(nums, 0, nums.length-1);
        for(int i : nums){
            System.out.print(i + " -> ");
        }            
    }
}
