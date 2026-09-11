package Backend.Java.BasicQuestion;
import java.util.Scanner;

public class LargestOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     System.out.print("Enter the number :");
     int a = sc.nextInt();
     System.out.print("Enter the number :");
     int b = sc.nextInt();
     System.out.print("Enter the number :");
     int c = sc.nextInt();

     if (a > b) {
        System.out.println("A is Greatest Number");
     } else if (a > c) {
        System.out.println("A is Greatest Number");
     } else if (b > c) {
        System.out.println("B is Greeatest Number");
     } else{
        System.out.println("C is Greatest Number");
     }
    }
}
