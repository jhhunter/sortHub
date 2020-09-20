package Runner;

public class SortingObject {

    private int[] sortingArray;

    /**
     * The object to be sorted
     * @param n - Number of elements in the list
     */
    public SortingObject(int n) {
        sortingArray = new int[n];
        for(int i = 0; i < n; i++) {
            sortingArray[i] = i;
        }
        shuffleSortingArray();
        for(int item : sortingArray) {
            System.out.print(item + " ");
        }
    }

    /**
     * Shuffle the sorting array multiple times using math.random()
     * Go over the array 100 times to make it truly random
     */
    private void shuffleSortingArray() {
        for(int j = 0; j < 100; j++) {
            for(int i = 0; i < sortingArray.length; i++) {
                int newIndex = (int)Math.floor((Math.random() * sortingArray.length));
                int oldValue = sortingArray[newIndex];
                sortingArray[newIndex] = sortingArray[i];
                sortingArray[i] = oldValue;
            }
        }
    }

}
