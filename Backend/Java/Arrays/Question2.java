/*    Write a java program for Storing and Displaying the heights of players 
  *      take the number of player and Height of players ass user input.   
 */

package Backend.Java.Arrays;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of player : ");
        int noplayer = sc.nextInt();

        System.out.println("Enter the Height of players : ");
        Float [] heightArr = new Float[noplayer];

          for(int i = 0; i <= heightArr.length-1; i++)
          {
            heightArr[i] = sc.nextFloat();
          }

        System.out.println("The Height of player are : ");
           
          for(int i = 0; i <= heightArr.length-1; i++)
          {
            System.out.println(heightArr[i]);
          }
    }
}
