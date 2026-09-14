// this program is to append a string to another string
import java.util.Scanner;
public class append_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        String appendedString = new StringBuilder(str1).append(str2).toString();
        System.out.println("The appended string is: " + appendedString);
        sc.close();
    }
}