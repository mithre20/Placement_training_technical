// this program is to print the column with maximum sum in the given 2d array
import java.util.Scanner;
public class Maximum_sum_coln {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element of the array at position (" + i + "," + j + ")");
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        int maxSum=0;
        int maxCol=0;
        for(int j=0;j<cols;j++){
            sum=0;
            for(int i=0;i<rows;i++){
                sum+=arr[i][j];
            }
            if(sum>maxSum){
                maxSum=sum;
                maxCol=j;
            }
        }
        System.out.println("Column with maximum sum is: " + maxCol);
        System.out.println("Maximum sum is: " + maxSum);        
    }
}
