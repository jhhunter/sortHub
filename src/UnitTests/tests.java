package UnitTests;

import Runner.SortingObject;
import SortingAlgorithms.BubbleSort;
import SortingAlgorithms.Sort;
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
     *
     */
    @Test
    public void testBubbleSort() {
        
    }

}