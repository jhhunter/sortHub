package SortingAlgorithms;

public class MergeSort extends Sort {

    int[] array;
    
    @Override
    public int[] sort(int[] unsorted_list) {
        array = unsorted_list.clone();
        mergesort(new int[array.length], 0, array.length - 1);
        return super.sort(unsorted_list);
    }

    private void mergesort(int[] temp, int left, int right) {
        if(left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergesort(temp, left, mid);
        mergesort(temp, mid + 1, right);
        mergehalves(temp, left, right);
    }

    private void mergehalves(int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd) {
            if(array[left] <= array[right]) {
                temp[index] = array[left];
                left+=1;
            }
            else {
                temp[index] = array[right];
                right+=1;
            }
            index+=1;
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }
}
