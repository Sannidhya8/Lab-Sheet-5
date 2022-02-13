package Array;

public class Q11 {
    public static void main (String[] args){
        int number[]={1,2,3,4,5,6,7,5,4,2,8};
        for(int i=0; i<number.length; i++){
            for(int j=i+1; j<number.length; j++){
                if(number[i]==number[j]){
                    System.out.println(number[i]+" is a dublicate value");
                }
                
            }
        }
    }
    
}