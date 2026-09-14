//this program to find whether the given array is in ascending order or descending order or not sorted 
import java.util.Scanner;
public class asc_desc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        boolean ascending = true;
        boolean descending = true;
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                ascending = false;
            }
            if(arr[i] < arr[i + 1]) {
                descending = false;
            }
        }
        if(ascending) {
            System.out.println("The given array is in ascending order");
        }
        else if(descending) {
            System.out.println("The given array is in descending order");
        }
        else {
            System.out.println("The given array is not sorted");
        }
        sc.close();
    }
}