// this program is to count and print the number of vowels and consonants in the given  string 
import java.util.Scanner;
public class vowels_consonents {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        java.lang.String str = sc.nextLine();
        int vowelsCount = 0;
        int consonantsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
        sc.close();
    }
}