import java.util.Arrays;

public class QuickSort {
    public static void main (String[] args) {
        int[] nums = new int[]{4,5,2,6,4,8,1,3,5};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort (int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = nums[left];//pivot value
        int i = left, j = right;

        while (i <= j) {
           //Part1: Move pointer in right half then stop at the position where value is greater than pivot value.
           //Wait for replacement.
            while(i <= j && nums[i] < pivot) {
                i++;
            }//end of part 1

           //Part2: Move pointer in left half and stop at the posiion where value is less than pivot value
           //Wait for replacement
            while(i <= j && nums[j] > pivot) {
                j--;
            }//end of part 2
            //Part3: Exchange then move pointer to the next
            if (i <= j) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                i++;
                j--;
            }
        }

        //Recursive until all the elements are sorted
        quickSort(nums,left, j);
        quickSort(nums, i, right);
    }
}
