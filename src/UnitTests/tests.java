package UnitTests;

import Runner.SortingObject;
import SortingAlgorithms.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for each sorting algorithm and the randomizer
 */

public class tests {

    SortingObject obj1 = new SortingObject(100);
    SortingObject obj2 = new SortingObject(1000);
    SortingObject obj3 = new SortingObject(10000);


    /**
     * Test the Randomizer to verify the arrays do not match
     * Because it is possible to get a number randomly in the correct spot,
     * we test that less than 10% of the values are in the correct spot
     */
    @Test
    public void testRandomizer() {
        assertNotNull(obj1);
        assertNotNull(obj2);
        assertNotNull(obj3);
        int obj1_similarities = 0;
        int obj2_similarities = 0;
        int obj3_similarities = 0;
        for(int i = 0; i < 10000; i++) {
            if(i < 100) {
                if(obj1.getSortedArray()[i] == obj1.getUnsortedArray()[i]) {
                    obj1_similarities+=1;
                }
                if(obj2.getSortedArray()[i] == obj2.getUnsortedArray()[i]) {
                    obj2_similarities+=1;
                }
                if(obj3.getSortedArray()[i] == obj3.getUnsortedArray()[i]) {
                    obj3_similarities+=1;
                }
            }
            else if(i < 1000) {
                if(obj2.getSortedArray()[i] == obj2.getUnsortedArray()[i]) {
                    obj2_similarities+=1;
                }
                if(obj3.getSortedArray()[i] == obj3.getUnsortedArray()[i]) {
                    obj3_similarities+=1;
                }
            }
            else {
                if(obj3.getSortedArray()[i] == obj3.getUnsortedArray()[i]) {
                    obj3_similarities+=1;
                }
            }
        }
        assertTrue(obj1_similarities < 10);
        assertTrue(obj2_similarities < 100);
        assertTrue(obj3_similarities < 1000);
    }

    /**
     * Test that bubble sort accurately sorts the array of n integers
     */
    @Test
    public void testBubbleSort() {
        Sort bubble_sorter = new BubbleSort();
        int[] obj1_test = bubble_sorter.sort(obj1.getUnsortedArray());
        int[] obj2_test = bubble_sorter.sort(obj2.getUnsortedArray());
        int[] obj3_test = bubble_sorter.sort(obj3.getUnsortedArray());

        for(int i = 0; i < 10000; i++) {
            if(i < 100) {
                assertEquals(obj1.getSortedArray()[i], obj1_test[i]);
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else if(i < 1000) {
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else {
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
        }
    }

    /**
     * Test that Quick sort accurately sorts the array of n integers
     */
    @Test
    public void testQuickSort() {
        Sort quick_sorter = new QuickSort();
        int[] obj1_test = quick_sorter.sort(obj1.getUnsortedArray());
        int[] obj2_test = quick_sorter.sort(obj2.getUnsortedArray());
        int[] obj3_test = quick_sorter.sort(obj3.getUnsortedArray());

        for(int i = 0; i < 10000; i++) {
            if(i < 100) {
                assertEquals(obj1.getSortedArray()[i], obj1_test[i]);
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else if(i < 1000) {
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else {
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
        }
    }

    /**
     * Test that Merge sort accurately sorts the array of n integers
     */
    @Test
    public void testMergeSort() {
        Sort merge_sorter = new MergeSort();
        int[] obj1_test = merge_sorter.sort(obj1.getUnsortedArray());
        int[] obj2_test = merge_sorter.sort(obj2.getUnsortedArray());
        int[] obj3_test = merge_sorter.sort(obj3.getUnsortedArray());

        for(int i = 0; i < 10000; i++) {
            if(i < 100) {
                assertEquals(obj1.getSortedArray()[i], obj1_test[i]);
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else if(i < 1000) {
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else {
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
        }
    }

    /**
     * Test that Insertion sort accurately sorts the array of n integers
     */
    @Test
    public void testInsertionSort() {
        Sort insert_sorter = new InsertionSort();
        int[] obj1_test = insert_sorter.sort(obj1.getUnsortedArray());
        int[] obj2_test = insert_sorter.sort(obj2.getUnsortedArray());
        int[] obj3_test = insert_sorter.sort(obj3.getUnsortedArray());

        for(int i = 0; i < 10000; i++) {
            if(i < 100) {
                assertEquals(obj1.getSortedArray()[i], obj1_test[i]);
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else if(i < 1000) {
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else {
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
        }
    }

    /**
     * Test that Bucket sort accurately sorts the array of n integers
     */
    @Test
    public void testBucketSort() {
        Sort bucket_sorter = new BucketSort();
        int[] obj1_test = bucket_sorter.sort(obj1.getUnsortedArray());
        int[] obj2_test = bucket_sorter.sort(obj2.getUnsortedArray());
        int[] obj3_test = bucket_sorter.sort(obj3.getUnsortedArray());

        for(int i = 0; i < 10000; i++) {
            if(i < 100) {
                assertEquals(obj1.getSortedArray()[i], obj1_test[i]);
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else if(i < 1000) {
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else {
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
        }
    }

    /**
     * Test that Heap sort accurately sorts the array of n integers
     */
    @Test
    public void testHeapSort() {
        Sort heap_sorter = new HeapSort();
        int[] obj1_test = heap_sorter.sort(obj1.getUnsortedArray());
        int[] obj2_test = heap_sorter.sort(obj2.getUnsortedArray());
        int[] obj3_test = heap_sorter.sort(obj3.getUnsortedArray());

        for(int i = 0; i < 10000; i++) {
            if(i < 100) {
                assertEquals(obj1.getSortedArray()[i], obj1_test[i]);
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else if(i < 1000) {
                assertEquals(obj2.getSortedArray()[i], obj2_test[i]);
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
            else {
                assertEquals(obj3.getSortedArray()[i], obj3_test[i]);
            }
        }
    }

}