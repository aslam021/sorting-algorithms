package org.baeldung;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Sort {

    public static void main( String[] args ) {
<<<<<<< HEAD
//from master
//      added some text from b1
=======
// new b1
//        added some text from b1
>>>>>>> b1
        int array[] = new int[args.length];
        getIntArray(args, array);

        int[] arrayCopy1 = Arrays.copyOf(array, array.length);
        int[] arrayCopy2 = Arrays.copyOf(array, array.length);

        System.out.println("\n\n");
        Sort sort = new Sort();
        sort.runInsertionSort(array);
        sort.runSelectionSort(arrayCopy1);
        sort.runBubbleSort(arrayCopy2);
        System.out.println("\n\n");
    }

    private static void getIntArray(String [] args, int [] array) {
        try{
            for (int i=0; i<args.length; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
        } catch (Exception e) {
            System.out.println("\nException occurred: " + e + "\n");
            System.exit(0);
        }
    }

    private void runInsertionSort(int arr[]){
        InsertionSort insertionSort = new InsertionSort();

        int n = arr.length;

        long startTime = System.nanoTime();
        insertionSort.sort(arr);
        long endTime = System.nanoTime();

        insertionSort.printArray(arr);
        System.out.println("Time taken: "+(endTime - startTime) + " ns  (Insertion)");
    }

    private void runBubbleSort(int arr[]){
        BubbleSort bubbleSort = new BubbleSort();

        int n = arr.length;

        long startTime = System.nanoTime();
        bubbleSort.bubbleSort(arr);
        long endTime = System.nanoTime();

        bubbleSort.printArray(arr);
        System.out.println("Time taken: "+(endTime - startTime) + " ns  (Bubble)");
    }

    private void runSelectionSort(int arr[]){
        SelectionSort selectionSort = new SelectionSort();

        long startTime = System.nanoTime();
        selectionSort.sort(arr);
        long endTime = System.nanoTime();

        selectionSort.printArray(arr);
        System.out.println("Time taken: "+(endTime - startTime) + " ns  (Selection)");
    }
}
