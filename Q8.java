package Array;

public class Q8 {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,8,7};
        int max=number[0];
        int min=number[0];
        for(int i=0; i<number.length; i++){
            if(number[i]>max){
                max=number[i];
            }
            if(number[i]<min){
                min=number[i];
            }
        }
        System.out.println("the maximum value is: "+max+"\n"+" the minimum value is: "+min);

        // To get diffrence (question number 9)
        int diff=max-min;
        System.out.println("the difference between "+max+" and "+min+" is "+diff);
    }
    
}