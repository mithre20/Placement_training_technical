//this program is to find the largest element in the given 2d array
import java.util.Scanner;
public class Largest_element_2d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.println("Enter the element of the array at position (" + i + "," + j + ")");
                arr[i][j] = sc.nextInt();
            }
        }
        int largest=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        System.out.println("The largest element in the 2D array is: " + largest);
    }
}