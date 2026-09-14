//this program is to print if the gieven element is present in the array or not print the message found or not found accordingly
import java.util.Scanner;
public class element_present{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
    }
}