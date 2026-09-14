// this program is to print all prime numbers from 1 to n 
import java.util.Scanner;
public class prime_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int num = 2; num <= n; num++) {
            boolean prime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num);
            }
        }
    }
}