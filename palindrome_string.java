// this program is to check if the given string is palindrome or not
import java.util.Scanner;
public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean isPalindrome = true;
        for (int first = 0, last = str.length() - 1; first < last; first++, last--) {
            if (str.charAt(first) != str.charAt(last)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }
        sc.close();
    }
}