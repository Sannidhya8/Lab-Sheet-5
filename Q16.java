
package Array;

// import java.util.Arrays;
import java.util.Scanner;
public class Q16 {
    static void displayMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
    }
    static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                int sum=0;
                for(int k=0; k<matrix1[0].length; k++){
                    sum+=matrix1[i][k] * matrix2[k][j];
                }
                result[i][j]=sum;
                System.out.println(sum);
            }
           
        }
        return result;
    }
       
    static void inputMatrix(int[][] matrix, Scanner sc) {
        int rows = matrix.length, col = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
            matrix[i][j] = sc.nextInt();
            }
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("================== Numbers for Matrix 1 ==================");
            System.out.println("Enter the numbers of rows: ");
            int firstRow = sc.nextInt();
            System.out.println("Enter the number of columns: ");
            int firstCol = sc.nextInt();

            System.out.println("================== Numbers for Matrix 2 ==================");
            System.out.println("Enter no of rows: ");
            int secondRow = sc.nextInt();
            System.out.println("Enter no of columns: ");
            int secondCol = sc.nextInt();
            if (firstCol == secondRow) {
                int[][] matrix1 = new int[firstRow][firstCol];
                int[][] matrix2 = new int[secondRow][secondCol];

                System.out.println("Enter the elements for 1st matrix: ");
                System.out.println("====================================================");
                inputMatrix(matrix1, sc);
                System.out.println("====================================================");
                displayMatrix(matrix1);
                System.out.println("====================================================");
                System.out.println("Enter the elements for 2nd matrix: ");
                System.out.println("====================================================");
                inputMatrix(matrix2, sc);
                System.out.println("====================================================");
                displayMatrix(matrix2);
                System.out.println("====================================================");
                int[][] result = multiplyMatrix(matrix1, matrix2);
                System.out.println("====================================================");
                System.out.println("The result of matrix multiplication is: ");
                System.out.println("====================================================");
                displayMatrix(result);
                System.out.println("====================================================");
            } 
            else{
                System.out.println("Multiplication is not eligible.");
            }
    }
}