package SortingAlgorithms;

public class InsertionSort extends Sort {

    /**
     * Implementation of insertion sort.
     *
     * Average Performance: O(n^2)
     *
     * Works by going to each index starting at 1 and comparing the value at the index
     * to the to the values before it. While it is less than the value at an index before
     * it, it continues to compare to smaller indexes until it is larger. This way, items
     * are put into the correct spot as they are sorted.
     * @param unsorted_list - The unsorted array
     * @return a sorted array of integers
     */
    @Override
    public int[] sort(final int[] unsorted_list) {
        int[] sorted_list = unsorted_list.clone();
        for(int i = 1; i < unsorted_list.length; i++) {
            int sort_val = sorted_list[i];
            int j = i -1;
            while(j >= 0 && sorted_list[j] > sort_val) {
                sorted_list[j + 1] = sorted_list[j];
                j-=1;
            }
            sorted_list[j+1] = sort_val;
        }
        return sorted_list;
    }
}
