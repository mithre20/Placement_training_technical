// this program is to print the first occurrence of the given element in the given 2d array
import java.util.Scanner;
public class First_Occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == search) {
                    System.out.println("Element found at (" + i + "," + j + ")");
                    return;
                }
            }
        }

        System.out.println("Element not found");
    }
}