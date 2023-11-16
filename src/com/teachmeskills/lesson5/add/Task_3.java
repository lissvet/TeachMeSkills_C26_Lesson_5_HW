package com.teachmeskills.lesson5.add;
/**Create a two-dimensional array of integers.
 *Print the sum to the console all elements of the array.*/
public class Task_3 {

    public static void main(String[] args) {
        int sum = 0;
        int[][] array = {{5,7,9,10},{8,55,49,20}};
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                sum = sum + array[i][j];
            }
        }
        System.out.println(sum);
    }

}
