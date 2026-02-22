package assignment;
import java.util.Arrays;

/**
 * Implements quick sort from lecture.
 */


public class QuickSort {

    static void main() {
        //for testing
        int[] arr = {10, 24,5, 4, 6, 33,7, 2, 1};
        sort(arr, 0, arr.length -1);
        IO.println(Arrays.toString(arr));

    }


    static void sort(int[] arr, int low, int hi) {

        if (low >= hi) {
            return;
        }
        int pIndex = 0;

        /**
         * TODO:
         *  Task: implement the method you learned in the lectures.
         *  Hint: you may also insert the correct method call from hint.SortingMethods.*
         *
         **/


        // now pivot is at index pIndex, sort two partitions recursively
        if (low < pIndex - 1) {
            sort(arr, low, pIndex - 1);
        }
        if (pIndex + 1 < hi) {
            sort(arr, pIndex + 1, hi);
        }

    }
}