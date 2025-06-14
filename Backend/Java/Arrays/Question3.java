//  Find the Largest element in an array.
 
package Backend.Java.Arrays;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        System.out.println("Enter the element of an array");
        int[] number = new int[size];

        // Storing the numaber
        for(int i = 0; i <= number.length-1; i++)
        {
            number[i] = sc.nextInt();
        }       
        
        //  Assume first number  is max
                int max = number[0];

        for(int i = 0; i <= number.length-1; i++)
        {
            if(number[i] > max)
            {
                // Update max if largest number is found
                max = number[i];
            }
        }  
        System.out.println("The largest element is: " +max);              
    }
}
