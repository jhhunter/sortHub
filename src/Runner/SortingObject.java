package Runner;

import java.util.HashMap;

public class SortingObject {

    private int[] unsorted_array;
    private int[] sorted_array;

    /**
     * The object to be sorted
     * @param n - Number of elements in the list
     */
    public SortingObject(int n) {
        unsorted_array = new int[n];
        sorted_array = new int[n];
        for(int i = 0; i < n; i++) {
            unsorted_array[i] = i;
            sorted_array[i] = i;
        }
        shuffleSortingArray();
    }

    /**
     * Shuffle the sorting array using math.random()
     * The randomizer chooses a random index to ensure there are no duplicate values
     */
    private void shuffleSortingArray() {
        for(int i = 0; i < unsorted_array.length; i++) {
            int newIndex = (int)Math.floor((Math.random() * unsorted_array.length));
            int oldValue = unsorted_array[newIndex];
            unsorted_array[newIndex] = unsorted_array[i];
            unsorted_array[i] = oldValue;
        }
    }

    /**
     * Returns Sorting array
     */
    public int[] getUnsortedArray() {
        return unsorted_array;
    }

    /**
     * Returns the sorted version of the Array
     */
    public int[] getSortedArray() {
        return sorted_array;
    }

}
