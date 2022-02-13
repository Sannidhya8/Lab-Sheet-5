package Array;

public class Q12 {
    public static void main(String[] args) {
        int A1[]={1,2,3,4,6,8,9,6,7};
        int A2[]={1,3,4,11,12,8,6};
        for(int i=0; i<A1.length; i++){
            for(int j=0; j<A2.length; j++){
                if(A1[i]==A2[j]){
                    System.out.println(A1[i]);
                }
            }
        }
    }
    
}