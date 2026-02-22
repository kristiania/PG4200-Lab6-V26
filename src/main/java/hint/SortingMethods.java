package hint;

/********************
 * Hint one:
 * Each of the methods is used in one of the sorting algorithms
 * You may consult the lecture slides to find the correct methods
 *
 * Hint two:
 * the methods are insert/merge/partition/swap
 *
 * Hint three at the bottom of this file
 * ....
 ********************/
public class SortingMethods {

    static void method0(int[] arr, int j, int k){
        while((j >=0) && (arr[j] > k)){
            arr[j + 1] = arr[j];
            j = j - 1;
        }

        arr[j+1] = k;
    }


    static void method1(int[] arr, int j, int k){
        int temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
    }

    static int method2(int[] arr,  int l, int r) {
        int temp;
        int p = arr[r];
        int leftIndex = l; // will scan rightward
        int rightIndex = r - 1; // will scan leftward
        while (leftIndex <= rightIndex) {
            // Scan rightward to find an element larger than p.
            while ((leftIndex <= rightIndex) &&
                    (arr[leftIndex]<p)) {
                leftIndex++;
            }
            // Scan leftward to find an element smaller than p.
            while ((rightIndex >= leftIndex) &&
                    (arr[rightIndex]>=p)) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                // Both elements were found.
                temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
            }
        } // The loop continues until the indices cross.

        method1(arr, leftIndex, r);

        return leftIndex;
    }

    static  void method3(int[] arr,
                               int[] leftArr, int[] rightArr) {
        int i = 0;
        int j = 0;
        for (int k = 0; k < arr.length; k++) {
            if (j >= rightArr.length || (i < leftArr.length
                    && (leftArr[i] <= rightArr[j]) )) {
                arr[k] = leftArr[i++];
            } else {
                arr[k] = rightArr[j++];
            }
        }
    }

}



/*********************
 *
 * Hint three:
 * method0 through method3 are called from the sorting algorithms as follows (not necessarily in that order).
 *
 * a) BubbleSort.sort:
 *    swap(arr, j, j+1); // swap j with j+1
 * b) Insertion.sort:
 *    insert(arr, i -1, key); // insert key at the correct position and shift elements to the right
 * c) MergeSort.sort:
 *     merge(arr, left, right); // merge array left with array right
 * d) QuickSort.sort:
 *     int pIndex = partition(arr, low, hi); // finds some arbitrary pivot and sorts elements of array between index low and hi and returns index of pivot
 ********************/
