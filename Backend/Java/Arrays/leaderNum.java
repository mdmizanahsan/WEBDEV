
// Given an array arr[] of size n, the task is to find all the Leaders in the array. 
// An element is a Leader if it is greater than or equal to all the elements to its right side.


package Backend.Java.Arrays;

public class leaderNum {
 
    public static void main(String[] args){

        int [] arr = {16,17,4,5,2};

        int max = arr[arr.length-1];
        
        System.out.print("Leader: ");
        System.out.print(max + " ");

          for(int i = arr.length-2; i >= 0; i--){
            if (arr[i] >= max) {
                System.out.print(arr[i] + " ");
                max = arr[i];                
            }
          }
    }
}
