package com.impetus;

/**
 * @author diksha
 *
 */
public final class BubbleSort {
	/**
	 * displayarray method to display the array .
	 */
	/**
	 * @param arr .
	 */
	void displayArray(final int[] arr) {
	final int arrlen = arr.length ;
	for (int count = 0 ; count < arrlen ; count++) {
			System.out.println(arr[count]) ;
		}

	}
	/**
	 * constructor
	 */
	private BubbleSort() {
}
	/**
	 * @param args .
	 */
	public static void main(final String[] args) {
		final BubbleSort ob = new BubbleSort() ;
		final int[] arr = {5 , 3 , 9 , 2 , 4} ;
		ob.bubblesort(arr);
		System.out.println("Sorted array") ;
		ob.displayArray(arr);
	}
	/**
	 * bubblesort method to sort the array .
	 */
	/**
	 * @param arr .
	 */
	void bubblesort(final int[] arr) {
 final int arrlen = arr.length ;
			for (int pass = 0 ; pass < arrlen ; pass++) {
				for (int step = 0 ; step < arrlen - pass - 1 ; step++) {
					if (arr[step] > arr[ step + 1]) {
						final int temp = arr[step] ;
						arr[step] = arr[step + 1] ;
						arr[step + 1] = temp ;
					}
				}
}

	}

}
