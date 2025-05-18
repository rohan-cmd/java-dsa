package MergeSort;

import java.util.*;

public class Main {

    public static int[] merge(int[] n1, int[] n2){
        int[] combined = new int[n1.length + n2.length];
        int index = 0, i=0, j=0;
        while (i<n1.length && j<n2.length) {
            if(n1[i]<n2[j]){
                combined[index] = n1[i];
                index++;
                i++;
            }else{
                combined[index] = n2[j];
                index++;
                j++;
            }
        }

        while (i<n1.length) {
            combined[index] = n1[i];
            index++;
            i++;            
        }

        while (j<n2.length) {
            combined[index] = n2[j];
            index++;
            j++;            
        }

        return combined;
    }

    public static int[] mergeSort(int[] nums){
        if (nums.length==1) {
            return nums;
        }
        int midIndex = (nums.length/2);
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(nums, midIndex, nums.length));

        return merge(left, right);
    }
    public static void main(String[] args) {
        int[] nums = {4,2,6,5,1,3};
        int [] newNums = mergeSort(nums);
        for(int i : newNums){
            System.out.print(i + " -> ");
        }            
    }
}
