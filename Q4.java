package Array;
import java.util.Scanner;
public class Q4 {
    public static void checkValue(int[] num, int value){
        for(int i=0; i<num.length; i++){
            if(num[i]==value){
                System.out.println("value is found at index: "+i);
                return;
            } 
        }
        System.out.println("Value is not found.");
    }
    public static void main(String[] args) {
        Scanner vv=new Scanner(System.in);
        System.out.println("Enter the number of element:");
        int n=vv.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the element:");
        for(int i=0; i<n; i++){
            System.out.println("number "+(i+1)+"; ");
            num[i]=vv.nextInt();
        }
        System.out.println("Enter the value to be found:");
        int value=vv.nextInt();
        checkValue(num, value);
        vv.close();
    }
    
}