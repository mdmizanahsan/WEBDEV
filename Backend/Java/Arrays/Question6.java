/*    Write a java program to create an integer array.take the position as well as element as an input
 *    from the user store the element at the given position in the array. Display the store element on
 *    the console. Even the size of array has to be taken as an input from the keyboard. 
*/    

package Backend.Java.Arrays;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

          System.out.println("Enter the array length");
          int [] arrays = new int[sc.nextInt()];

          System.out.println("Enter the position to store the array");
          int pos = sc.nextInt();

            if(pos >= 0 && pos <= arrays.length-1)
            {
                System.out.println("Enter the element to insert at "+pos);
                int element = sc.nextInt();
                arrays[pos] = element;
                System.out.println("Element @ position "+pos+" is "+arrays[pos]);
            }
            else 
            {
                System.out.println("Position should be between 0 + 0 "+(arrays.length-1));
            }
    }
}
