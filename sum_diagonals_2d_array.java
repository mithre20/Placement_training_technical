// this program is to find the sum of both diagonals in the given 2d array
import java.util.Scanner;
class sum_diagonals_2d_array { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the element of the array at position (" + i + "," + j + ")");
                arr[i][j]=sc.nextInt();
            }
        }
        int sum1=0;   
        int sum2=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==j){
                    sum1+=arr[i][j];
                }
                if(i+j==rows-1){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of first diagonal is: " + sum1);
        System.out.println("Sum of second diagonal is: " + sum2);
    }
}