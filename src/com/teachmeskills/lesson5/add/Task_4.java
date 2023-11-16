package com.teachmeskills.lesson5.add;
/**Create a two-dimensional array. Print the diagonals of the array to the console.*/
public class Task_4 {

    public static void main(String[] args) {
        int[][] array = {{6,7,8,9},
                         {1,2,4,5},
                         {6,7,8,3},
                         {4,6,7,1}};
        for(int i=0; i<array.length; i++){
            System.out.print(array[i][i]);
        }
        System.out.println();
        int second = array.length-1;
        for(int i=0; i<array.length; i++){
            System.out.print(array[i][second]);
            second--;
        }
    }

}
