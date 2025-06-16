// Write a java program to copy the content of 1 array into another arrays.
 
package Backend.Java.Arrays;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array : ");
    int n = sc.nextInt();

    int[] arr1 = new int[n];

    System.out.println("Enter the array to store");
    for(int i = 0; i <= arr1.length-1; i++)
    {
        arr1[i] = sc.nextInt();
    }

    int [] arr2 = new int[arr1.length];

      for(int i =0; i <= arr1.length-1; i++)
      {
        arr2[i] = arr1[i];
      }

      System.out.println("Array1 content are");
      for(int i = 0; i <= arr1.length-1; i++)
      {
        System.out.println(arr1[i]+" ");
      }


      System.out.println("Array2 content are");
      for(int i = 0; i <= arr1.length-1; i++)
      {
        System.out.println(arr2[i]+" ");
      }
    }
}
