package Array;
import java.util.Arrays;

public class Q17 {
public static void main(String[] args) {
    
    int[][] matrix = {
                        { 1 },
                        { 2 },
                        { 3 } };
    int rows = matrix.length;
    int cols = matrix[0].length;
      // Transpose a matrix
    int[][] result = new int[cols][rows]; // 1 * 3
    
    // Transpose of matrix
    for (int i = 0; i < rows; i++) { // 0
        for (int j = 0; j < cols; j++) { // [i][j] = Value
        // System.out.println(i + " " + j + "=>" + matrix[i][j]);
        result[j][i] = matrix[i][j]; // result[0][1] = matrix[1][0]
        }
    }
    // Display the result
    // System.out.println(Arrays.deepToString(result));
    for (int[] i: matrix){
        System.out.println(Arrays.toString(i));
    }
    System.out.println(" ");
    for (int[] i : result) {
        System.out.println(Arrays.toString(i));
    }
    }
}