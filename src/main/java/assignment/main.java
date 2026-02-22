import assignment.AlgAnalysis;

void main() {

/**
 * Main method
 * Provides prompts for all experiments
 */

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to Lab 6: Here you can test and analyze running time behaviour of the sorting algorithms.");
            System.out.println("WARNING: you first need to finish the implementation in task 1 for the algorithms you want to test.");
            System.out.println("Enter 0 to test the different sorting algorithms, 1 to analyze worst time complexity, any other number to exit");
            int opt1 = scanner.nextInt();
            if(opt1 == 1){
                System.out.println("Enter number of arrays to test");
                int count = scanner.nextInt();
                System.out.println("Enter largest array size");
                int n = scanner.nextInt();

                System.out.println();
                while(true){
                    System.out.println("Enter 0 to test bubble sort, 1 for insertion sort,  2 for quick sort, 3 for merge sort, 4 for java native quicksort, any other number to exit");
                    int opt2 = scanner.nextInt();
                    if(opt2 == 0){
                        AlgAnalysis.arraySortRuntime(count, n, 0);
                        //System.out.println("Time Elapsed: "+AlgAnalysis.nanoToSeconds(AlgAnalysis.bubbleSortRuntime(n))+" secs");
                        System.out.println();
                    }
                    else if(opt2 == 1){
                        AlgAnalysis.arraySortRuntime(count, n, 1);
                        //System.out.println("Time Elapsed: "+AlgAnalysis.nanoToSeconds(AlgAnalysis.bubbleSortRuntime(n))+" secs");
                        System.out.println();
                    }
                    else if(opt2 == 2){
                        AlgAnalysis.arraySortRuntime(count, n, 2);
                        System.out.println();
                    }
                    else if(opt2 == 3){
                        AlgAnalysis.arraySortRuntime(count, n, 3);
                        System.out.println();
                    }
                    else if(opt2 == 4){
                        AlgAnalysis.arraySortRuntime(count, n, 4);
                        System.out.println();
                    }
                    else{
                        System.out.println("End of Program!");
                        return;
                    }
                }
            }
            else if(opt1 == 0){
                while(true){
                    System.out.println("Enter 0 to test bubble sort, 1 for insertion sort, 2 for quick sort, 3 for merge sort, 4 for java native quicksort, any other number to exit");
                    int opt2 = scanner.nextInt();
                    if(opt2 == 0){
                        System.out.println("Enter n value");
                        int n = scanner.nextInt();
                        System.out.println("Time Elapsed: "+AlgAnalysis.nanoToSeconds(AlgAnalysis.bubbleSortRuntime(n))+" secs");
                        System.out.println();
                    }
                    else if(opt2 == 1){
                        System.out.println("Enter n value");
                        int n = scanner.nextInt();
                        System.out.println("Time Elapsed: "+AlgAnalysis.nanoToSeconds(AlgAnalysis.insertionSortRuntime(n))+" secs");
                        System.out.println();
                    }
                    else if(opt2 == 2){
                        System.out.println("Enter n value");
                        int n = scanner.nextInt();
                        System.out.println("Time Elapsed: "+AlgAnalysis.nanoToSeconds(AlgAnalysis.quickSortRuntime(n))+" secs");
                        System.out.println();
                    }
                    else if(opt2 == 3){
                        System.out.println("Enter n value");
                        int n = scanner.nextInt();
                        System.out.println("Time Elapsed: "+AlgAnalysis.nanoToSeconds(AlgAnalysis.mergeSortRuntime(n))+" secs");
                        System.out.println();
                    }
                    else if(opt2 == 4){
                        System.out.println("Enter n value");
                        int n = scanner.nextInt();
                        System.out.println("Time Elapsed: "+AlgAnalysis.nanoToSeconds(AlgAnalysis.javaQuickSortRuntime(n))+" secs");
                        System.out.println();
                    }
                    else{
                        System.out.println("End of Program!");
                        return;
                    }
                }
            }
            else {
                System.out.println("End of Program!");
                return;
            }

        }


}