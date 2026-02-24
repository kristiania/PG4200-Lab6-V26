Lab pratice 6
=============




BubbleSort, InsertionSort, MergeSort and QuickSort
-----------------------------------------------------

> All tasks are completed within this `assignment`-package

task 1: complete code for sorting algorithms
--------------------------------------------

Complete the code-snippets in the four sorting-algorithms
by implementing the method you learned in the lectures:
- `assignment/BubbleSort.java` (simple), 
- `assignment/InsertionSort.java` (simple), 
- `assignment/MergeSort.java` (normal) and  
- `assignment/QuickSort.java` (hard).
 


> Hint: you may also insert the correct method call from `hint/SortingMethods.java`.

task 2: experimental analysis of sorting algorithms
---------------------------------------------------

For this task, we recommend to get have worked with [lab practice 4](https://github.com/kristiania/PG4200-Lab4-V26/tree/master/src/main/java/assignment) on how to experimentally measure the running time of algorithms.

> You first need to finish the implementation in task 1 for the algorithms you want to test.

Use the sorting algorithms with various setting and observe the behavior. 
With _AlgAnalysis.arraySortRuntime_ you may investigate whether the running time of a sorting algorithm  behaves more closely as O(n^2) or more closely as O(n log n).



extra task a: randomize Quick Sort
------------------------------------

The quick-sort implementation in `hint/SortingMethods.java` is not randomized . Randomize the pivot selection and observe any change in running time.

extra task b: change input for sorting
------------------------------------

Refactor your favorite sorting algorithm so that it may sort objects [which implement the  _Comparable_ interface](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) .
F.e. [Strings are comparable](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#compareTo-java.lang.String-): for two Strings _s1_, _s2_, you may use _s1.compareTo(s2)_ which returns _true_ if _s1_ is before and _false_ if _s1_ is after _s2_ in alphabetically order.

extra task c: change data structure for sorting
----------------------------------------------

Refactor your favorite sorting algorithm with your favorite data structure.
F.e. _ArrayList_ or _LinkedList_. Some sorting algorithms may benefit from that, whilst others won't necessarily. Observe any change in running time.
