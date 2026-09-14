//this program is to demonstrate the use of arrays in Java
/*import java.util.Scanner;
public class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}*/


// this  program is to find the largest difference between elements in the given array 
/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        int difference = max - min;
        System.out.println("The largest difference between elements in the array is: " + difference);
        sc.close();
    }
}*/

// this program is to move all the zeroes in the given array to the end of the array by maintaining the order of the other elements in the given array
/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        int[] newArr = new int[n];
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                newArr[j++] = arr[i];
            }
        }
        for(int i=0;i<count;i++){
            newArr[j++] = 0;
        }
        System.out.println("Array after moving zeroes to the end:");
        for(int i=0;i<n;i++){
            System.out.print(newArr[i] + " ");
        }
        sc.close();
    }
}*/

// this program is to arrange even and odd numbers in the given array by getting input from the user and print the even numbers first and then odd numbers in the arra
/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        int[] evenArr = new int[n];
        int[] oddArr = new int[n];
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenArr[evenCount++] = arr[i];
            }
            else{
                oddArr[oddCount++] = arr[i];
            }
        }
        System.out.println("Even numbers in the array:");
        for(int i=0;i<evenCount;i++){
            System.out.print(evenArr[i] + " ");
        }
        System.out.println("\nOdd numbers in the array:");
        for(int i=0;i<oddCount;i++){
            System.out.print(oddArr[i] + " ");
        }
        sc.close();
    }
}*/

// this program is to print the given array is a palindrome or not by getting the input array from the user 
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        boolean isPalindrome = true;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("The given array is a palindrome");
        }
        else{
            System.out.println("The given array is not a palindrome");
        }
        sc.close();
    }
}