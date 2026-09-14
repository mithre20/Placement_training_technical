// this program is to check if the given matrix is upper triangular matrix or not 
import java.util.Scanner;
class Upper_Triangular_Matrix {
    public static void main(String[] args){
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
        } for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
        
        boolean isUpperTriangular=true;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i>j && arr[i][j]!=0){
                    isUpperTriangular=false;
                    break;
                }
            }
        }
        if(isUpperTriangular){
            System.out.println("The given matrix is an upper triangular matrix.");
        }
        else{
            System.out.println("The given matrix is not an upper triangular matrix.");
        }
    }
}