package assignment;
import java.util.Arrays;
import static hint.SortingMethods.*;

/**
 * Implements insertion sort from lecture.
 */

public class InsertionSort {
    static void main() {
        //for testing
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        IO.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Pick the element to insert;
            int j = i -1; // Start comparing with previous elements;

            /**
             * TODO:
             *  Task: implement the method you learned in the lectures.
             *  Hint: you may also insert the correct method call from hint.SortingMethods.*
             *
             **/


        }

    }
}
