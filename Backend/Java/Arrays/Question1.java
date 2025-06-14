/*    Write a java program to create an array to store marks of five
 *       students and also display the data stored in the array.
*/

package Backend.Java.Arrays;

public class Question1 {
    public static void main(String[] args) {
        
        //Create an array
        int [] marksArr = new int[5];

        //Storing marks in the array
        marksArr [0] = 77;
        marksArr [1] = 50;
        marksArr [2] = 19;
        marksArr [3] = 94;
        marksArr [4] = 38;

        //Displaying marks stored in array
        System.out.println(marksArr[0]);
        System.out.println(marksArr[1]);
        System.out.println(marksArr[2]);
        System.out.println(marksArr[3]);
        System.out.println(marksArr[4]);
    }
}
