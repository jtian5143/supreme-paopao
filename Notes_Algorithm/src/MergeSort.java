import java.util.Arrays;

public class MergeSort {
    public static void main (String[] args) {
        int[] arr = new int[]{6,5,1,2,4,9,3};
        sortIntegers2(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sortIntegers2(int[] arr) {
        int[] temp = new int[arr.length];
        sort(arr, temp, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (right + left) / 2;
        sort(arr, temp, left, mid);
        sort(arr, temp, mid + 1, right);
        merge(arr, temp, left, right);
    }

    private static void merge(int[] array, int[] tmp, int left, int right) {
        //int[] tmp = new int[right - left + 1];
        int mid = (right + left) / 2;
        int i = left, j = mid + 1;

        for(int k = 0; k < right - left + 1; k++) {
            if (i <= mid && j <= right) {
                if (array[j] <= array[i]) {
                    tmp[k] = array[j++];
                } else {
                    tmp[k] = array[i++];
                }
            } else if (i > mid) {
                tmp[k] = array[j++];
            } else {
                tmp[k] = array[i++];
            }
        }

        for (int k = 0; k < right - left + 1; k++) {
            array[k + left] = tmp[k];
        }
    }
}
