package SortingAlgorithms;

public class MergeSort extends Sort {

    int[] array;

    /**
     * Implementation of MergeSort
     *
     * Average Performance: O(nlogn)
     *
     * An efficient algorithm that divides the array of elements recursively into
     * multiple list. When the list is fully divided, each recursive layer is
     * merged together in order so that each layer going back up is 2 ordered
     * lists. Largest downside to this algorithm is the spatial complexity due to
     * each layer getting temporary arrays.
     * @param unsorted_list The unsorted list of elements
     * @return A sorted array from smallest to largest
     */
    @Override
    public int[] sort(int[] unsorted_list) {
        array = unsorted_list.clone();
        mergeSort(0, array.length-1);
        return array;
    }

    private void mergeSort(int left, int right) {
        if(left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(left, mid);
        mergeSort(mid + 1, right);
        merge(left, mid, right);
    }

    private void merge(int leftStart, int middle, int rightEnd) {
        int n1 = (middle - leftStart) + 1;
        int n2 = (rightEnd - middle);

        int[] leftTemp = new int[n1];
        int[] rightTemp = new int[n2];
        for(int i = 0; i < n1; i++) {
            leftTemp[i] = array[leftStart + i];
        }
        for(int i = 0; i < n2; i++) {
            rightTemp[i] = array[(middle + 1) + i];
        }

        int left = 0, right = 0;
        int arrayIndex = leftStart;
        while(left < n1 && right < n2) {
            if(leftTemp[left] <= rightTemp[right]) {
                array[arrayIndex] = leftTemp[left];
                left+=1;
            }
            else {
                array[arrayIndex] = rightTemp[right];
                right+=1;
            }
            arrayIndex+=1;
        }

        while(left < n1) {
            array[arrayIndex] = leftTemp[left];
            left+=1;
            arrayIndex+=1;
        }
        while(right < n2) {
            array[arrayIndex] = rightTemp[right];
            right+=1;
            arrayIndex+=1;
        }
    }

}
