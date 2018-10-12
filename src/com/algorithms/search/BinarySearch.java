package com.algorithms.search;

import sun.text.resources.in.FormatData_in;

/**
 * DATE 2018/10/12.
 *
 * @author chaoqun.
 */
public class BinarySearch {

    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex + 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;

            if (mid > key) {
                high = mid + 1;
            } else if (mid < key) {
                low = mid - 1;
            } else if (mid == key) {
                return mid;
            }
        }
        return -(low + 1);
    }
}
