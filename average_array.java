// this program is to print the average of the elements in the given array
import java.util.Scanner;
public class average_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            }
        int Average=0;
        for(int i=0;i<n;i++){
            Average=Average+arr[i];
        }
        double result=Average/n;
        System.out.println("the average sum of the elements in the given array is:"+result);
    }
}