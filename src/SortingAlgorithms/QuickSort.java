package SortingAlgorithms;

public class QuickSort extends Sort {

    private int[] array;

    @Override
    public int[] sort(int[] unsorted_list) {
        array = unsorted_list.clone();
        quicksort(array, 0, unsorted_list.length - 1);
        return array;
    }

    private static void quicksort(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }
        int piv = (left + right) / 2;
        int index = partition(array, left, right, piv);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int piv) {
        while(left <= right) {
            while(array[left] < piv) {
                left++;
            }
            while(array[right] > piv) {
                right--;
            }

            if(left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}
