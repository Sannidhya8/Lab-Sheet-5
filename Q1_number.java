package Array;
import java.util.Scanner;
public class Q1_number {
    public static void main(String[] args) {
        int n, i;
        
        // try to remove the aa error
        try (Scanner aa = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            n=aa.nextInt();
            System.out.println();
            
            int num[]=new int[n];
            for (i=0; i<n; i++){
                num[i]=aa.nextInt();
            } 
            System.out.println("the numbers are:");
            for(i=0; i<n; i++){
                System.out.println(num[i]);
            }
            aa.close();
        }
    }
}