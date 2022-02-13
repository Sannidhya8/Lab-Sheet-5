package Array;
import java.util.Arrays;
public class Q5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int newArr[]= new int[arr.length-1];
        int index=0;
        int itemToRemove=1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=itemToRemove){
                newArr[index]=arr[i];
                index++;
            }
        }
        // for(int i=0; i<newArr.length; i++){
        //     System.out.println(newArr[i]);
        // } (CAN DO THI COMMENTED PART OF THE BELOW ONE)
        
        System.out.println(Arrays.toString(newArr));

    }
    
}