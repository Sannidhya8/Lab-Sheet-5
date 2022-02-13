package Array;

public class Q13{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,9,7,8};
        int largest=arr[0];
        int temp=0,i;//j;
        for(i=0; i<arr.length; i++){
            // for(j=i+1; j<arr.length; j++){
            //     if(arr[i]>arr[j]){
            //         temp=arr[j];
            //         arr[j]=arr[i];
            //         arr[i]=temp;
            //     }
            // } 
            if(arr[i]>largest){
                temp=largest;
                largest=arr[i];
                arr[i]=temp;
            }
                   
        }
        System.out.println("The second largest value is " +temp);
    }
}