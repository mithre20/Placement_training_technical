// this program is to check if matrix is identity matrix or not
import java.util.Scanner;  
public class identity_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean isIdentity = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && arr[i][j] != 1) {
                    isIdentity = false;
                    break;
                } else if (i != j && arr[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
            if (!isIdentity) {
                break;
            }
        }
        if (isIdentity) {
            System.out.println("The given matrix is an identity matrix.");
        } else {
            System.out.println("The given matrix is not an identity matrix.");
        }
    }
}