// this program is to check if the given array is sorted or not 
import java.util.Scanner;
public class Sorted_arrary_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        boolean sorted = true;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if(sorted) {
            System.out.println("The given array is sorted");
        }
        else {
            System.out.println("The given array is not sorted");
        }
        sc.close();
    }
}