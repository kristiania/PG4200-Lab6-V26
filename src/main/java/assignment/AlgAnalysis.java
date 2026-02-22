package assignment;
// CSI2110 Fall 2015 Laboratory 1A: Algorithm Runtimes
// ==========================================================================
// (C)opyright:
//
//   Lachlan Plant
//   SITE, University of Ottawa
//   800 King Edward Ave.
//   Ottawa, ON, K1N 6N5
//   Canada.
//   http://www.site.uottawa.ca
//
// Creator: lplant (Lachlan Plant)
// Email:   lplan053@uottawa.ca
// ==========================================================================
// $Log: Lab00.java,v $
// Revision 1.0  2015/09/14 01:20:40  lplant
// Revision 1.1  2015/09/19 11:21:00  Lucia Moura
// Revision 1.2  2026/02/22 11:21:00  Frederic Dorn
// ==========================================================================

import java.util.Arrays;
import java.util.Random;

public class AlgAnalysis {

    /**
     * Tests runtimes of the different sorting algorithms
     * Runs experiments to find the average time taken to sort arrays of n elements
     * prints results directly
     *
     * @param  maxSize size of largest array to be tested
     * @param  count number of arrays tested.
     */
    public static void arraySortRuntime(int count, int maxSize, int algToCheck){
        int interval = maxSize/count;
        if (interval==0) interval=1;
        for(int i = interval; i <= maxSize; i+=interval){
            long res = 0;
            for(int j =0; j<10; j++){
                int[] test = randomizeArray(genArray(i));
                long start = System.nanoTime();
                //FDO: testing several sorting algorithms
                switch(algToCheck) {
                    case 0 -> BubbleSort.sort(test);
                    case 1 -> InsertionSort.sort(test);
                    case 2 -> QuickSort.sort(test, 0, test.length - 1);
                    case 3 -> MergeSort.sort(test);
                    case 4 -> Arrays.sort(test);
                    default -> IO.println("No algorithm chosen.");
                }
                long end = System.nanoTime();
                long time = end - start;
                if(res < time) res = time;
            }

            double nSqr= ((double)res/(double)(i*i));
            double nLog = (double)res/((double)i*(Math.log(i)/Math.log(2)));
            System.out.println("N: "+i+", T(n): "+res+" nanosecs, T(n)/(n*n): "+nSqr+", T(n)/(nlogn): "+nLog);
        }
    }

    /**
     * creates an array of size n, then tests the runtime of BubbleSort.sort using that array
     *
     * @param  n size of array
     * @return time taken in nano seconds
     */
    public static long bubbleSortRuntime(int n){
        int[] test = randomizeArray(genArray(n));
        long start = System.nanoTime();
        BubbleSort.sort(test);
        long end = System.nanoTime();
        return end - start;
    }

    /**
     * creates an array of size n, then tests the runtime of InsertionSort.sort using that array
     *
     * @param  n size of array
     * @return time taken in nano seconds
     */
    public static long insertionSortRuntime(int n){
        int[] test = randomizeArray(genArray(n));
        long start = System.nanoTime();
        InsertionSort.sort(test);
        long end = System.nanoTime();
        return end - start;
    }

    /**
     * creates an array of size n, then tests the runtime of QuickSort.sort using that array
     *
     * @param  n size of array
     * @return time taken in nano seconds
     */
    public static long quickSortRuntime(int n){
        int[] test = randomizeArray(genArray(n));
        long start = System.nanoTime();
        QuickSort.sort(test, 0, test.length - 1);
        long end = System.nanoTime();
        return end - start;
    }


    /**
     * creates an array of size n, then tests the runtime of MergeSort.sort using that array
     *
     * @param  n size of array
     * @return time taken in nano seconds
     */
    public static long mergeSortRuntime(int n){
        int[] test = randomizeArray(genArray(n));
        long start = System.nanoTime();
        MergeSort.sort(test);
        long end = System.nanoTime();
        return end - start;
    }

    /**
     * creates an array of size n, then tests the runtime of JDK-version of QuickSort Arrays.sort using that array
     *
     * @param  n size of array
     * @return time taken in nano seconds
     */
    public static long javaQuickSortRuntime(int n){
        int[] test = randomizeArray(genArray(n));
        long start = System.nanoTime();
        Arrays.sort(test);
        long end = System.nanoTime();
        return end - start;
    }

    /**
     * Generates an array of ins of size n
     * Array contains values array[i]=i
     *
     * @param  n size of array
     * @return ordered array
     */
    private static int[] genArray(int n){
        int[] ret = new int[n];
        for(int i=0; i < ret.length; i++){
            ret[i] = i;
        }
        return ret;
    }

    /**
     * Randomly shuffles an array
     *
     * @param  array array of ints to be shuffled
     * @return      randomized array
     */
    private static int[] randomizeArray(int[] array){
        Random rng = new Random();

        for (int i=array.length -1; i > 0; i--) {
            //rng.nextInt(N) returns random number between 0 and N-1 inclusive
            int randomPosition = rng.nextInt(i);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }

    /**
     * Convert time in nanoseconds to seconds
     *
     * @param  time time in nanoseconds
     * @return      time in seconds as a double
     */
    public static double nanoToSeconds(long time){
        return (double)time / 1000000000.0;
    }


}