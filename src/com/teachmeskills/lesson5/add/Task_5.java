package com.teachmeskills.lesson5.add;

import java.util.Arrays;
/**Create a two-dimensional array of integers.
 * Sort the elements into rows of a two-dimensional array in ascending order.*/
public class Task_5 {

    public static void main(String[] args) {
        int[][] array = {{9,2,6,0},{4,9,8,5},{44,75,28,8},{44,75,28,8}};
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println(Arrays.deepToString(array));
    }

}
