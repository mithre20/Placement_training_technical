// This is a program to check if two strings are anagrams.
import java.util.Scanner;
public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.print("Enter the second string: ");
        String second = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        if (first.length() != second.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }
        int[] characterCounts = new int[Character.MAX_VALUE + 1];
        for (int index = 0; index < first.length(); index++) {
            characterCounts[first.charAt(index)]++;
            characterCounts[second.charAt(index)]--;
        }
        for (int count : characterCounts) {
            if (count != 0) {
                System.out.println("The strings are not anagrams.");
                return;
            }
        }
        System.out.println("The strings are anagrams.");
        sc.close();
    }
}