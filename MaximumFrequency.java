// this program is to find the maximum frequency character in the given string 
import java.util.Scanner;
public class MaximumFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int max = 0;
        char maxChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxChar = str.charAt(i);
            }
        }
        System.out.println("Character with maximum frequency: " + maxChar);
        System.out.println("Frequency: " + max);
    }
}