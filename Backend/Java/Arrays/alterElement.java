// Given an array arr[], the task is to print every alternate element of the array starting 
// from the first element.

package Backend.Java.Arrays;

public class alterElement {
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};

        for(int i = 0; i<= arr.length-1; i+=2){
             System.out.println(arr[i]);
        }
     
    }
}
