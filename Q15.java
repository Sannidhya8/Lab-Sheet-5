package Array;
public class Q15 {
    static void addArrays(int [][] aar, int [][] arr){
        int row=aar.length;
        int col= aar[0].length;
        int addedArray [][]=new int[row][col];
        System.out.println("------------------the added array is-------------------------");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                addedArray[i][j]=aar[i][j]+arr[i][j];
                System.out.print(addedArray[i][j]+"\t");
            }
            System.out.println();
        }
        
        
    }
    public static void main(String[] args) {
        int array1[][]={{1,2,3},
                        {2,3,4},
                        {3,6,8}};
        int array2[][]={{9,8,7},
                        {5,4,3},
                        {2,3,4}};
        System.out.println("----------------------first matrix------------------------");
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[0].length; j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------Second matrix------------------------");
        for(int i=0; i<array2.length; i++){
            for(int j=0; j<array2[0].length; j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        addArrays(array1, array2);

    }
    
}