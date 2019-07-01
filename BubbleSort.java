package com.impetus;
/**
 * @author diksha
 *
 */
public final class BubbleSort {
	    private final int []array = {40, 20, 13, 51, 64, 120, 10};
	    private int arrayLength = 0;
	    /**
	     *  Constructor to initialize array length
	     */
	    private BubbleSort() {
	        arrayLength = array.length;
	    }
	    /**
	     * sort method sorts the unsorted array
	     */
	    public void sort() {
	        for (int pass = 0 ; pass < arrayLength - 1 ; ++pass) {
	            for (int step = 0 ; step < arrayLength - 1 ; ++ step) {
	                if (array[step] > array[step + 1]) {
	                    final int temp = array[step];
	                    array[step] = array[step + 1];
	                    array[step + 1] = temp;
	                    }
	                }
	            }
	    }
	    /**
	     * display method to display the array
	     */
	    public void display() {
	        for (int iterator = 0 ; iterator < arrayLength ; ++iterator) {
	            System.out.print(array[iterator] + "\t");
	            }
	    }
	    /**
	     * @param args Command line Argument
	     */

	    public static void main(final String[] args) {
	        final BubbleSort bubble = new BubbleSort();
	        System.out.println("Unsorted Array:");
	        bubble.display();
	        bubble.sort();
	        System.out.println("\nSorted Array:");
	        bubble.display();
	        }
}
