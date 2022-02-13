import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Q18 {
    static void sortingArry(String [] aar){
        // for(int i=0; i<=aar.length-1; i++){
        //     for (int j=i+1; i<=aar.length; j++){
        //         if(aar[i].compareTo(aar[j])>0){
        //             String temp=aar[i];
        //             aar[i]=aar[j];
        //             aar[j]=temp;
        //         }
        //     }
        // }
        Arrays.sort(aar, Collections.reverseOrder());

        System.out.println("Elemnts in asecendin order:");
        System.out.println("Final array: "+Arrays.toString(aar));
    
    }
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the element of array:");
        String[] arr=ss.nextLine().split(" ");
        System.out.println("Initial array:"+Arrays.toString(arr));
        sortingArry(arr);
        ss.close();

    }
    
}