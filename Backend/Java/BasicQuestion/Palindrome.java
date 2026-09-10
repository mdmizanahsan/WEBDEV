package Backend.Java.BasicQuestion;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int n = sc.nextInt();

        int Palindrome = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10 ;
            reverse = reverse * 10 + digit ; 
            n = n / 10 ;
        }

        if (Palindrome == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
