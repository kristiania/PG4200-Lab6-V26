package assignment;
import java.util.Arrays;
import static hint.SortingMethods.*;


/**
 * Implements bubble sort from lecture.
 */
public class BubbleSort {

  static void main() {
      //for testing
      int[] arr = {5, 4, 3, 2, 1};
      sort(arr);
      IO.println(Arrays.toString(arr));
  }

  static void sort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n -1 - i; j++) {
        if (arr[j] > arr[j+1]) {
            /**
             * TODO:
             *  Task: implement the method you learned in the lectures.
             *  Hint: you may also insert the correct method call from hint.SortingMethods.*
             *
             **/
        }
      }
    }
  }
}
