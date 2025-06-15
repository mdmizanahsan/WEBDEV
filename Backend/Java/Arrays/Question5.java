  // Reverse an array

package Backend.Java.Arrays;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        System.out.println("Enter the number of element : ");
        int[] number = new int[size];

        for(int i = 0; i <= number.length-1; i++)
        {
             number[i] = sc.nextInt();
        }
             
             // Print original array
        System.out.println("Original array : ");
        for(int i = 0; i <= number.length-1; i++)
        {
            System.out.println(number[i]);
        }

             // print reversed array
        System.out.println("Reversed array : ");
        for(int i =size-1; i >= 0 ; i--)
        {
            System.out.println(number[i]);
        }
    }
}
