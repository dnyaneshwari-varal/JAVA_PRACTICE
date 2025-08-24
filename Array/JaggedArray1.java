package Array;

public class JaggedArray1 {
    public static void main(String[] varal){
        //jagged Array
        int arr[][]={{1,2,3},{1,2,3,4,5},{1,2}};
        System.out.println(arr.length); //give number of rows
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){ //arr[i].length means it check each row element or length
                System.out.print(arr[i][j]);
            }System.out.println();

        }
    }
        
}
