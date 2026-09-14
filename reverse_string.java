// this program is to print the reverse of the string given by the user
import java.util.Scanner;
public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        System.out.println("The reversed string is: " + reversedStr.toString());
        sc.close();
    }
}