import java.util.Arrays;
import java.util.Scanner;
/**Create a three-dimensional array of integers.
 * Increase it by the number entered from the console. */
public class Task_0 {

    public static void main(String[] args) {
        int [][][] integer = {{{4,7,8},{9,10,15},{16,9,21}},{{50,45,66},{77,61,55},{83,100,154}}};
        System.out.println("Array values: ");
        System.out.println(Arrays.deepToString(integer));
        System.out.println("Enter the number by which you want to increase each element: ");
        Scanner scan = new Scanner(System.in);
        int increase = scan.nextInt();
        for (int i = 0; i < integer.length; i++) {
            for (int j = 0; j < integer[i].length; j++) {
                for (int k = 0; k < integer[i][j].length; k++) {
                    integer[i][j][k] += increase;
                }
            }
        }
        System.out.println(Arrays.deepToString(integer));
    }

}