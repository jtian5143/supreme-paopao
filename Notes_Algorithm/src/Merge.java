import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] nums = new int[]{1,4,6,2,5,8};
        merge(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void merge(int[] nums) {
        int[] tmp = new int[nums.length];
        int i = 0, mid = (nums.length - 1) / 2, j = mid + 1;
        for (int k = 0; k < nums.length; k++) {
            if (i <= mid && j <= nums.length - 1) {
                //sort the elements in each half session
                if (nums[i] <= nums[j]) {
                    tmp[k] = nums[i++];
                } else {
                    tmp[k] = nums[j++];
                }
            } else if (i > mid) {
                //all the right half have been used then continue with remaining elements in left half
                tmp[k] = nums[j++];
            } else if (j > nums.length - 1) {
                //the opposite to above case
                tmp[k] = nums[i++];
            }
        }

        for (int k = 0; k < nums.length; k++) {
            nums[k] = tmp[k];
        }
    }
}
