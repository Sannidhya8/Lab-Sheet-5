package Array;
import java.util.Arrays;
public class Q10 {
    public static void main (String[] args){
        int number[]={1,2,3,4,5,6,7,9};
        int reverseNum[]= new int[number.length];
        int index=0;  //new array index starting from 0 for reverse array
        for(int i=number.length-1; i>=0; i--){   //transversing array
            reverseNum[index]=number[i]; // from last to first
            index++;
        }
        System.out.println("Reverse array: "+Arrays.toString(reverseNum));
    }
    
}