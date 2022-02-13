package Array;

import java.util.Scanner;

public class Q2_Sum {
    public static void getSum(int[] a){
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        System.out.println("The sum of the element is: "+sum);
    }

    public static void getAverage(int[] a){
        int sum=0;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        System.out.println("the average of the element is: "+sum/a.length);
    }

    public static void main(String[] args) {
        Scanner aa=new Scanner (System.in);
        System.out.println("Enter a number of element:");
        int n=aa.nextInt();
        int [] a= new int[n];
        System.out.println("Enter the element:");
        for(int i=0; i<n; i++){
            System.out.println("Number "+(i+1)+"; ");
            a[i]=aa.nextInt();
        }
        getSum(a);
        getAverage(a);
        aa.close();
    }
    
}