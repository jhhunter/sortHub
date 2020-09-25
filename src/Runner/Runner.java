package Runner;

import SortingAlgorithms.BubbleSort;
import SortingAlgorithms.InsertionSort;
import SortingAlgorithms.QuickSort;
import SortingAlgorithms.Sort;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SortingObject toBeSorted = new SortingObject(scan.nextInt());

        //Calculate the time bubble sort takes
        long start = System.nanoTime();
        Sort sort = new BubbleSort();
        sort.sort(toBeSorted.getUnsortedArray());
        long end = System.nanoTime();
        //Runtime in nanoseconds
        long bbs = end-start;
        //Conversion to seconds
        double dbbs = bbs / 1000000000.0;
        if(dbbs < 0) {
            dbbs *= -1;
        }
        System.out.println("BubbleSort: " + dbbs + " seconds");

        //Calculate the time insertion sort takes
        start = System.nanoTime();
        sort = new InsertionSort();
        sort.sort(toBeSorted.getUnsortedArray());
        end = System.nanoTime();
        //Runtime in nanoseconds
        long is = end-start;
        //Conversion to seconds
        double dis = is / 1000000000.0;
        if(dis < 0) {
            dis *= -1;
        }
        System.out.println("InsertionSort: " + dis + " seconds");

        //Calculate the time quick sort takes
        start = System.nanoTime();
        sort = new QuickSort();
        sort.sort(toBeSorted.getUnsortedArray());
        end = System.nanoTime();
        //Runtime in nanoseconds
        long qs = end-start;
        //Conversion to seconds
        double dqs = qs / 1000000000.0;
        if(dqs < 0) {
            dqs *= -1;
        }
        System.out.println("QuickSort: " + dqs + " seconds");
    }

}
