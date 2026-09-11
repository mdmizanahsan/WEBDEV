package Backend.Java.BasicQuestion;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int N = sc.nextInt();

        int original = N;
        int ArmStrong = 0;

        while (N > 0) {
            int rem = N % 10;
            ArmStrong = ArmStrong + rem * rem * rem;
            N = N / 10 ;
        }
        if (original == ArmStrong) {
            System.out.println("ArmStrong");
        } else {
            System.out.println("Not ArmStrong");
        }
    }
}
