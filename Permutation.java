package com.impetus;
/**
 * @author impadmin
 *
 */
public class Permutation {
	   /**
     * @param first index
     * @param second index
     * @param arr array
     */
    final void swap(final int first, final int second, final char[] arr) {
        final char temp;
        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    /**
     * @param left INDEX
     * @param right INDEX
     * @param a ARRAY
     */
    final void findPermute(final int left, final int right, final char[] a) {
        if (left == right) {
            for (int count = 0; count <= left; count++) {
              System.out.print(a[count]);
            }
          System.out.println();
        }
        for (int var = left; var <= right; var++) {
            swap(var, left, a);
            findPermute(left + 1, right, a);
            swap(left, var, a);
        }
    }
    /**
     * @param args Command line argument
     */
    public static void main(final String[] args) {
        final char[] array = {'m', 'n', 'o'};
        final Permutation p = new Permutation();
        p.findPermute(0, 2, array);
    }
}

