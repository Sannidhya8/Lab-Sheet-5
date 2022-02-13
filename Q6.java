package Array;
import java.util.Arrays;
public class Q6 {
    public static void main(String[] args) {
        int Arr[]={3,4,5,5,6,7,8,9};
        int newArr[]= new int[Arr.length];
        for(int i=0; i<Arr.length; i++){
            newArr[i]=Arr[i];
        }
        // for(int i=0; i<newArr.length; i++){
        //     System.out.println(newArr[i]);
        // }

        System.out.println(Arrays.toString(newArr));
    }
    
}