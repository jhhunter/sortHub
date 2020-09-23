package SortingAlgorithms;

public class BubbleSort extends Sort {

    /**
     * Implementation of Bubble Sort
     *
     * Average Performance: O(n^2)
     *
     * Works by iterating through the array, comparing each element to the next
     * and swapping them if the first integer is smaller than the next. It keeps
     * iterating through the list until nothing is swapped meaning the items are
     * all sorted
     * @param unsorted_list - An unsorted array of integers
     * @return a sorted array of integers
     */
    @Override
    public int[] sort(final int[] unsorted_list) {
        int n = unsorted_list.length;
        int[] sorted_list = unsorted_list;
        boolean swapped = false;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (n-1); j++) {
                if(sorted_list[j] > sorted_list[j+1]) {
                    swapped = true;
                    int old_val = sorted_list[j+1];
                    sorted_list[j+1] = sorted_list[j];
                    sorted_list[j] = old_val;
                }
            }
        }
        return sorted_list;
    }
}
