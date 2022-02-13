import java.util.Arrays;
public class Q28 {
    static void sortElement(int [] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                int temp=0;
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        int arr[] ={7,3,5,1,6,2,4,8};
        System.out.println(Arrays.toString(arr));
        System.out.println("Arrays in sorted form:");
        sortElement(arr);
        System.out.println(arr[0]+" and "+arr[1]+" are the first and second smallest element.");
    }
    
}