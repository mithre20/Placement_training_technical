// this program is print the sum of two matrices 
import java.util.Scanner;
public class Matrix_Addition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols=sc.nextInt();
        int arr1[][]=new int[rows][cols];
        int arr2[][]=new int[rows][cols];
        int sum[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element of the first array at position (" + i + "," + j + ")");
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element of the second array at position (" + i + "," + j + ")");
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}