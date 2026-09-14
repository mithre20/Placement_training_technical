// this program is to find the longest word length in the given string 
import java.util.Scanner;
public class longest_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        System.out.println("The length of the longest word is: " + maxLength);
        sc.close();
    }
}