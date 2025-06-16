//   W.J.P to read a character as user input and print its unicode value.

package Backend.Java.String;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);

        int unicode = ch;
         System.out.println("Unicode value of char "+ch+"is : "+unicode);
    }
}
