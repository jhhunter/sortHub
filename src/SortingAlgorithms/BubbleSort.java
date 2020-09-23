package SortingAlgorithms;

public class BubbleSort extends Sort {

    @Override
    public int[] sort(final int[] unsorted_list) {
        int n = unsorted_list.length;
        int[] sorted_list = unsorted_list;
        boolean swapped = false;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (n-1); j++) {
                if(sorted_list[j] > sorted_list[j+1]) {
                    swapped = true;
                }
            }
        }
        return sorted_list;
    }
}
