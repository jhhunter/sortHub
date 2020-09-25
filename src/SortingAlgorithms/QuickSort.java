package SortingAlgorithms;

public class QuickSort extends Sort {

    private int[] array;


    /**
     * Implementation of QuickSort
     *
     * Average Performance: O(nlogn)
     *
     * Works by dividing and conquering. An efficient algorithm that uses a pivot and
     * puts smaller elements to the left of the pivot and larger elements to the right.
     * Then the algorithm is done on each side of the pivot to further sort the list. The
     * process is continued until there is nothing left to sort.
     * @param unsorted_list The unsorted list of elements
     * @return A sorted array from smallest to largest
     */
    @Override
    public int[] sort(int[] unsorted_list) {
        array = unsorted_list.clone();
        quicksort(0, unsorted_list.length - 1);
        return array;
    }

    void quicksort(int low, int high) {
        if (low < high)
        {
            int piv = partition(low, high);
            quicksort(low, piv-1);
            quicksort(piv+1, high);
        }
    }

    int partition(int low, int high) {
        int pivot = array[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (array[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }
}
