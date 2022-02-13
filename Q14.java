package Array;
import java.util.Scanner;
public class Q14 {
    static void calculateSum(int aar[][], int row, int cols){
        int sumRow=0;
        // int sumCol=0;
        int totalSum=0;
        int resultedArray[][]=new int [row+1][cols+1];
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                sumRow=sumRow+aar[i][j];
                resultedArray[i][j]=aar[i][j];
            }
            resultedArray[i][cols]=sumRow;
            totalSum=totalSum+sumRow;
        }
        System.out.println(sumRow+"\n"+totalSum);
    }
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the number of row:");
        int n=ss.nextInt();
        System.out.println("Enter the number of column:");
        int m=ss.nextInt();
        int array[][]= new int[n][m];
        System.out.println("--------Enter the element of array----------------");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array[i][j]=ss.nextInt();
            }
        }
        System.out.println("---------the given matrix is-------------");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        ss.close();
        calculateSum(array,n,m);
    }
    
}