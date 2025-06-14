        //  Sum of all Elements in arrays

package Backend.Java.Arrays;

import java.util.Scanner;

public class Question4 {
   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of an arrays : ");
    int size = sc.nextInt();

    System.out.println("Enter the number of Element : ");
    int[] number = new int[size];

         for(int i = 0; i <= number.length-1; i++)
             {
                number[i] = sc.nextInt();
             }

             int sum = 0;

             for(int i = 0; i <= number.length-1; i++)
             {
                sum = sum + number[i];
             }

     System.out.println("The Sum of array is = " +sum);    
   }
}
